package com.opq.bb.game.states;

import com.opq.base.ConfigureReader;
import com.opq.base.GameCoefficientConfReader;
import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.ShotContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class FreeShotState extends ShotState{
    @Autowired
    GameCoefficientConfReader gameCoefficientConfReader;



    @Override
    protected double calcInRate(GameContext context) {
        Player a = context.getSelectA().get(0);
        double rate = adjustShotRate(a.getBaseSkill().getFreeShot());
        return rate;
    }

    @Override
    protected State getShotResult(GameContext context) {
        ShotContext shotContext = context.getShotContext();
        int shotTime = shotContext.getFreeShotTime();
        double shotRate = calcInRate(context);
        for (int i = 0;i < shotTime - 1; ++i){
            boolean in = this.isIn(shotRate);
            if (in){
                System.out.println("Shot is in");
            }else{
                System.out.println("Shot not in");
            }
        }
        boolean in = this.isIn(shotRate);
        if (in){
            System.out.println("Shot is in");
        }else{
            System.out.println("Shot is not in");
            context.setGameState(StateFactory.getReboundState());
        }
        return null;
    }


}
