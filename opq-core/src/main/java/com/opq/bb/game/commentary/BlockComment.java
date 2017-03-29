package com.opq.bb.game.commentary;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/29.
 */
public class BlockComment implements IComment{
    @Override
    public String getComment(GameContext context, Integer result) {
        return null;
    }

    @Override
    public String getComment(List<Player> selectA, List<Player> selectB, Integer result) {
        return selectA.get(0).getName() + " 吃了 " + selectB.get(0).getName() + " 一记火锅!!";
    }
}
