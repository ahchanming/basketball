package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.commentary.IComment;
import com.opq.bb.game.module.AttackContext;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.StartBallContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class StartBallState implements State{

    private static IComment comment;

    @Override
    public void handler(GameContext context) {
        StartBallContext startBallContext = context.getStartBallContext();
        List<Player> selectA;
        List<Player> selectB;
        if (context.isHomeRound()){
            selectA = context.getHomePlayerOn();
            selectB = context.getGuestPlayerOn();
        }else{
            selectA = context.getGuestPlayerOn();
            selectB = context.getHomePlayerOn();
        }
        List<Player> startBallPlayer = new ArrayList<>(2);
        startBallPlayer.add(selectA.get(2));
        startBallPlayer.add(selectA.get(0));
        context.addComment(comment.getComment(selectA, new ArrayList<>(), 0));
        AttackContext attackContext = new AttackContext();
        attackContext.setFrontCourt(startBallContext.isFrontCourt());
        context.setGameState(StateFactory.getAttackState());
    }
}
