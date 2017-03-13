package com.opq.bb.factorys;

import com.opq.bb.game.module.ShotContext;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class ShotContextFactory {
    public static ShotContext createFreeShotContext(){
        ShotContext shotContext = new ShotContext();
        shotContext.setFreeShotTime(3);
        return shotContext;
    }

    public static ShotContext createFreeShotContext(int shotTime){
        ShotContext shotContext = new ShotContext();
        shotContext.setFreeShotTime(shotTime);
        return shotContext;
    }
}
