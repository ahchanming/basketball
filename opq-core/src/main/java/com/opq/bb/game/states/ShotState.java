package com.opq.bb.game.states;

import com.opq.bb.game.module.GameContext;

/**
 * Created by opq.chen on 2017/3/10.
 */
public abstract class ShotState implements State{

    protected abstract double calcInRate(GameContext context);
    protected abstract State getShotResult(GameContext context);

    protected double adjustShotRate(Integer rate){
        return rate;
    }

    protected boolean isIn(double rate){
        return Math.random() * 1000 < rate;
    }

    @Override
    public void handler(GameContext context) {
        context.setGameState(this.getShotResult(context));
        //计算概率
        //计分
        //取得下一个状态
    }
}
