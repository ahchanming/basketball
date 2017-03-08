package com.opq.bb.game.executors;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/8.
 */
public class ShotExecutor implements ExecutorBase{
    @Override
    public void doExecure(GameContext gameContext) {
        Player playerA = gameContext.getSelectA().get(0);
    }
}
