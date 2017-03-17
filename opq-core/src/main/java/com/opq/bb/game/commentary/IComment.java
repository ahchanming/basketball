package com.opq.bb.game.commentary;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;

import java.util.List;

/**
 * Created by vickeyjchen on 2017/3/12.
 */
public interface IComment {
    public String getComment(GameContext context, Integer result);

    public String getComment(List<Player> selectA, List<Player> selectB, Integer result);

}
