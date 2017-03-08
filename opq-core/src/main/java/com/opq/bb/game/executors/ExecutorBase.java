package com.opq.bb.game.executors;

import com.opq.bb.game.module.GameContext;

/**
 * Created by opq.chen on 2017/3/8.
 */
public interface ExecutorBase {
    //public ExecutorBase selectNext();
    void doExecure(GameContext gameContext);
}
