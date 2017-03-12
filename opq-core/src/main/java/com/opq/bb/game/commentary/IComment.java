package com.opq.bb.game.commentary;

import com.opq.bb.game.module.GameContext;

/**
 * Created by vickeyjchen on 2017/3/12.
 */
public interface IComment {
    public String getComment(GameContext context, Integer result);
}
