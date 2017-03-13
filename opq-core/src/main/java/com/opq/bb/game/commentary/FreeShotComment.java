package com.opq.bb.game.commentary;

import com.opq.bb.game.module.GameContext;

/**
 * Created by vickeyjchen on 2017/3/12.
 */
public class FreeShotComment implements IComment{

    @Override
    public String getComment(GameContext context, Integer result) {
        String playerName = context.getSelectA().get(0).getName();
        if (result == 0){
            return playerName + " free shot in!";
        }else{
            return playerName + " not in";
        }
    }
}
