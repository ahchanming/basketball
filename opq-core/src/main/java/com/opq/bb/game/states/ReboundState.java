package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.elements.skill.BaseSkillRate;
import com.opq.bb.game.module.GameContext;
import com.sun.org.apache.regexp.internal.RE;

import java.util.List;

/**
 * fight for rebound
 * Created by opq.chen on 2017/3/10.
 */
public class ReboundState implements State{

    private static BaseSkillRate rate = new BaseSkillRate();
    private static double HEIGHT_RATIO = 0.3;
    private static double DUMP_RATIO = 0.2;
    private static double STRONG_RATIO = 0.2;
    private static double REBOUND_RATIO = 1;
    static{
        rate.setHeight(HEIGHT_RATIO);
        rate.setDump(DUMP_RATIO);
        rate.setStrong(STRONG_RATIO);
        rate.setRebound(REBOUND_RATIO);
    }

    private double ability(Player player){
        //return height * 0.5 + dump * 0.2 + strong * 0.2 + rebound;
        return player.getBaseSkill().getHeight();
    }

    public Player selectOne(GameContext context){
        List<Player> aPlayers = context.getSelectA();
        List<Player> dPlayers = context.getSelectB();
        return null;
    }


    @Override
    public void handler(GameContext context) {

    }
}
