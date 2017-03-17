package com.opq.bb.factorys;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.PlayerContext;
import com.opq.bb.game.module.ScoreStatistics;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class GameFactory {
    public static GameContext createNewGame(List<Player> homeTeam, List<Player> guestTeam){
        GameContext gameContext = new GameContext();

        PlayerContext playerContext = new PlayerContext(homeTeam, guestTeam);
        gameContext.setPlayerContext(playerContext);

        gameContext.setHomeTeamPlayers(homeTeam);
        gameContext.setGuestTeamPlayers(guestTeam);

        ScoreStatistics scoreStatistics = new ScoreStatistics(homeTeam, guestTeam);
        gameContext.setScoreStatistics(scoreStatistics);
        gameContext.setOutputs(new ArrayList<>());
        return gameContext;
    }
}
