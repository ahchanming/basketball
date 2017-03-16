package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.StartBallContext;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class StartBallState implements State{

    @Override
    public void handler(GameContext context) {
        StartBallContext startBallContext = context.getStartBallContext();
        List<Player> selectA;
        List<Player> selectB;
        if (context.isHomeRound()){
            selectA = context.getHomeTeamPlayers()
        }
    }
}
