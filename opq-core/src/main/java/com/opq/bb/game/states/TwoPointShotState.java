package com.opq.bb.game.states;

import com.opq.bb.game.module.GameContext;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class TwoPointShotState extends ShotState{

    @Override
    protected double calcInRate(GameContext context) {
        return 0;
    }

    @Override
    protected State getShotResult(GameContext context) {
        return null;
    }
}
