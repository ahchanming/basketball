package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;

import com.opq.bb.game.module.ShotContext;
import org.apache.commons.collections4.CollectionUtils;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class TwoPointShotState extends ShotState{

    @Override
    protected boolean isBlock(Player a, Player b) {
        Integer skillDis = a.getBaseSkill().getShot() - b.getBaseSkill().getBlock();
        Integer bodyDis = a.getBaseSkill().getDump() + a.getBaseSkill().getHeight()
                - b.getBaseSkill().getHeight() - b.getBaseSkill().getDump();
        if (skillDis + bodyDis < -10){
            return true;
        }
        return false;
    }



    /**
     * if return 0 means block
     * @param context
     * @return
     */
    @Override
    protected double calcInRate(GameContext context) {
        Player shotPlayer = context.getSelectA().get(0);
        Player blockPlayer = null;
        if (CollectionUtils.isNotEmpty(context.getSelectB())){
            blockPlayer = context.getSelectB().get(0);
        }
        if (blockPlayer == null){
            double rate = adjustShotRate(blockPlayer.getBaseSkill().getShot());
            return rate;
        }
        Integer shotSkill = shotPlayer.getBaseSkill().getShot();
        Integer blockSkill = shotPlayer.getBaseSkill().getBlock();
        return 0;
    }

    @Override
    protected State getShotResult(GameContext context) {
        double rate = calcInRate(context);
        return null;
    }
}
