package com.opq.bb.game.states;

import com.opq.bb.game.module.GameContext;

/**
 * Created by opq.chen on 2017/3/10.
 */
public interface State {
    public void handler(GameContext context);
}