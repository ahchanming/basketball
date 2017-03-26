package com.opq.bb.game.commentary;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/17.
 */
public class StartBallComment implements IComment{
    @Override
    public String getComment(GameContext context, Integer result) {
        return null;
    }

    @Override
    public String getComment(List<Player> selectA, List<Player> selectB, Integer result) {
        Player a = selectA.get(0);
        Player b = selectA.get(1);
        return "边线开球 " + a.getName() + " 将球传给 " + b.getName();
    }
}
