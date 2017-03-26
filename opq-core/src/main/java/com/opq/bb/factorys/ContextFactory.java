package com.opq.bb.factorys;

import com.opq.bb.game.commentary.StartBallComment;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.StartBallContext;

/**
 * Created by vickeyjchen on 2017/3/26.
 */
public class ContextFactory {
    public static StartBallContext createStartBallContext(GameContext context){
        StartBallContext startBallContext = new StartBallContext();
        if (context.isHomeRound()){
            startBallContext.setSelectA(context.getHomeTeamPlayers());
            startBallContext.setSelectB(context.getGuestTeamPlayers());
        }else{
            startBallContext.setSelectA(context.getGuestTeamPlayers());
            startBallContext.setSelectB(context.getHomeTeamPlayers());
        }
        return startBallContext;
    }
}
