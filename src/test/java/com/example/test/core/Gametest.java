package com.example.test.core;

import com.opq.bb.elements.member.Player;
import com.opq.bb.factorys.ContextFactory;
import com.opq.bb.factorys.GameFactory;
import com.opq.bb.factorys.PlayerFactory;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.states.StateFactory;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by vickeyjchen on 2017/3/26.
 */
public class Gametest extends TestBase{

    @Test
    public void test(){
        List<Player> homeTeam = new ArrayList<>();
        homeTeam.add(PlayerFactory.createPlayer("opq1"));
        homeTeam.add(PlayerFactory.createPlayer("opq2"));
        homeTeam.add(PlayerFactory.createPlayer("opq3"));
        homeTeam.add(PlayerFactory.createPlayer("opq4"));
        homeTeam.add(PlayerFactory.createPlayer("opq5"));
        List<Player> guestTeam = new ArrayList<>();
        guestTeam.add(PlayerFactory.createPlayer("qpo1"));
        guestTeam.add(PlayerFactory.createPlayer("qpo2"));
        guestTeam.add(PlayerFactory.createPlayer("qpo3"));
        guestTeam.add(PlayerFactory.createPlayer("qpo4"));
        guestTeam.add(PlayerFactory.createPlayer("qpo5"));

        GameContext gameContext = GameFactory.createNewGame(homeTeam, guestTeam);
        gameContext.setGameState(StateFactory.getStartBallState());
        gameContext.setStartBallContext(ContextFactory.createStartBallContext(gameContext));
        gameContext.execute();
        System.out.println("Hello World");
    }
}
