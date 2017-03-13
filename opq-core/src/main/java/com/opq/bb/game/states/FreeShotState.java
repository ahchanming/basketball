package com.opq.bb.game.states;

import com.opq.base.ConfigureReader;
import com.opq.base.GameCoefficientConfReader;
import com.opq.bb.elements.member.Player;
import com.opq.bb.game.commentary.FreeShotComment;
import com.opq.bb.game.commentary.IComment;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.ScoreStatistics;
import com.opq.bb.game.module.ShotContext;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Random;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class FreeShotState extends ShotState{
    @Autowired
    GameCoefficientConfReader gameCoefficientConfReader;

    private IComment comment = new FreeShotComment();



    @Override
    protected double calcInRate(GameContext context) {
        Player a = context.getSelectA().get(0);
        double rate = adjustShotRate(a.getBaseSkill().getFreeShot());
        return rate;
    }

    @Override
    protected State getShotResult(GameContext context) {
        Player player = context.getSelectA().get(0);
        ShotContext shotContext = context.getShotContext();
        int shotTime = shotContext.getFreeShotTime();
        double shotRate = calcInRate(context);
        for (int i = 0;i < shotTime; ++i){
            boolean in = this.isIn(shotRate);
            if (in){
                System.out.println("Shot is in");
                context.getOutputs().add(comment.getComment(context, 0));
                context.getScoreStatistics().playerShot(player, ScoreStatistics.SHOT_TYPE.FREE_SHOT, 1);
            }else{
                System.out.println("Shot not in");
                context.getOutputs().add(comment.getComment(context, 1));
                context.getScoreStatistics().playerShot(player, ScoreStatistics.SHOT_TYPE.FREE_SHOT, 0);
            }
            if (i == shotTime - 1){
                if (in){
                    System.out.println("kaiqiu");
                }else{
                    System.out.println("rebound");
                }
            }
        }
        return null;
    }


}
