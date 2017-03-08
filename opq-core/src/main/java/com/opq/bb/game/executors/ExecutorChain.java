package com.opq.bb.game.executors;

import com.opq.bb.game.module.GameContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/8.
 */
public class ExecutorChain {
    private List<ExecutorBase> executorBases = new ArrayList<>();
    private int index = 0;

    public ExecutorChain addExecutor(ExecutorBase executorBase){
        executorBases.add(executorBase);
        return this;
    }

    public void doExecute(GameContext gameContext){
        if (index == executorBases.size()) return;
        ExecutorBase e = executorBases.get(index);
        index++;
        e.doExecure(gameContext);
    }
}
