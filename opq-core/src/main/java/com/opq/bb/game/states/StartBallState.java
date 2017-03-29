package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.factorys.ContextFactory;
import com.opq.bb.game.commentary.IComment;
import com.opq.bb.game.commentary.StartBallComment;
import com.opq.bb.game.module.AttackContext;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.StartBallContext;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class StartBallState implements State{

    private static IComment comment = new StartBallComment();

    @Override
    public void handler(GameContext context) {
        StartBallContext startBallContext = context.getStartBallContext();
        List<Player> startBallPlayer = new ArrayList<>(2);
        startBallPlayer.add(startBallContext.getSelectA().get(1));
        startBallPlayer.add(startBallContext.getSelectA().get(0));
        context.addComment(comment.getComment(startBallPlayer, new ArrayList<>(), 0));
        context.setAttackContext(ContextFactory.createAttackContext(context));
        context.setGameState(StateFactory.getAttackState());
    }
}
