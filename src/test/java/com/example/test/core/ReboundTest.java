package com.example.test.core;

import com.example.test.utils.PlayerUtil;
import com.opq.bb.elements.member.Player;
import com.opq.bb.factorys.GameFactory;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.states.StateFactory;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/16.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ReboundTest {

    @Test
    public void testRebound(){
        List<Player> homeTeam = PlayerUtil.getHomeTeamPlayers();
        List<Player> guestTeam = PlayerUtil.getGuestTeamPlayers();
        GameContext context = GameFactory.createNewGame(homeTeam, guestTeam);
        context.setSelectA(homeTeam);
        context.setSelectB(guestTeam);
        context.setBallControll(0);
        context.setGameState(StateFactory.getReboundState());
        context.execute();
        System.out.println("Hello World");
    }
}
