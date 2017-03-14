package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.commentary.IComment;
import com.opq.bb.game.commentary.TwoPointShotComment;
import com.opq.bb.game.module.GameContext;

import com.opq.bb.game.module.ScoreStatistics;
import org.apache.commons.collections4.CollectionUtils;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class TwoPointShotState extends ShotState{

    private IComment comment = new TwoPointShotComment();

    @Override
    protected boolean isBlock(Player a, Player b) {
        Integer skillDis = a.getBaseSkill().getShot() - b.getBaseSkill().getBlock();
        Integer bodyDis = a.getBaseSkill().getDump() + a.getBaseSkill().getHeight()
                - b.getBaseSkill().getHeight() - b.getBaseSkill().getDump();
        if (Math.random() * -1000 > skillDis + bodyDis){
            return true;
        }
        return false;
    }

    @Override
    protected boolean isFoul(Player A, Player B) {
        return Math.random() * 1000 < 50;
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
        if (isBlock(shotPlayer, blockPlayer)) return -1;
        if (isFoul(shotPlayer, blockPlayer)) return -2;
        return adjustShotRate(shotPlayer.getBaseSkill().getShot()) * 0.8;
    }

    @Override
    protected State getShotResult(GameContext context) {
        Player player = context.getSelectA().get(0);
        double rate = calcInRate(context);
        if (rate == -1){
            System.out.println("Oh block!!!");
            return StateFactory.getFight4BallState();
        }else if (rate == -2){
            System.out.println("Defence foul");
            return StateFactory.getFreeShotState();
        }else{
            boolean in = this.isIn(rate);
            if (in){
                System.out.println("Two Point Shot is In");
                context.getScoreStatistics().playerShot(player, ScoreStatistics.SHOT_TYPE.TWP_POINT_SHOT, 1);
                context.getOutputs().add(comment.getComment(context, 1));
                return StateFactory.getStartBallState();
            }else{
                System.out.println("Two Point Shot not in");
                context.getScoreStatistics().playerShot(player, ScoreStatistics.SHOT_TYPE.TWP_POINT_SHOT, 0);
                return StateFactory.getReboundState();
            }
        }
    }
}
