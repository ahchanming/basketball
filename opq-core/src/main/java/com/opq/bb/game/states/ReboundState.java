package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.elements.skill.BaseSkillRate;
import com.opq.bb.game.commentary.ReboundComment;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.utils.GameUtil;
import com.sun.org.apache.regexp.internal.RE;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * fight for rebound
 * Created by opq.chen on 2017/3/10.
 */
public class ReboundState implements State{

    private static ReboundComment comment = new ReboundComment();

    private static BaseSkillRate rate = new BaseSkillRate();
    private static double HEIGHT_RATIO = 0.3;
    private static double DUMP_RATIO = 0.2;
    private static double STRONG_RATIO = 0.2;
    private static double REBOUND_RATIO = 1;
    private static double DEFENCE_RATIO = 1.5;

    static{
        rate.setHeight(HEIGHT_RATIO);
        rate.setDump(DUMP_RATIO);
        rate.setStrong(STRONG_RATIO);
        rate.setRebound(REBOUND_RATIO);
    }

    private double getReboundAbility(Player player){
        return GameUtil.calcSkill(player.getBaseSkill(), rate);
    }

    public Player selectOne(GameContext context){
        List<Player> aPlayers = context.getSelectA();
        List<Player> dPlayers = context.getSelectB();
        List<Double> reboundSkill = new ArrayList<>(aPlayers.size() + dPlayers.size());
        reboundSkill.addAll(aPlayers.stream().map(player -> getReboundAbility(player)).collect(Collectors.toList()));
        reboundSkill.addAll(dPlayers.stream().map(player -> getReboundAbility(player) * DEFENCE_RATIO).collect(Collectors.toList()));
        int index = GameUtil.selectOne(reboundSkill);
        if (index < aPlayers.size()){
            return aPlayers.get(index);
        }else{
            return dPlayers.get(index - aPlayers.size());
        }
    }


    @Override
    public void handler(GameContext context) {
        Player player = selectOne(context);
        context.getOutputs().add(comment.getComment(player));
        System.out.println("attack attack attack!!!");
    }
}
