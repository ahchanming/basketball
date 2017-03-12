package com.opq.bb.game.states;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vickeyjchen on 2017/3/11.
 */
public class StateFactory {
    private static Map<String, State> stateMap;
    static {
        stateMap = new HashMap<>();
        stateMap.put("reboudState", new ReboundState());
        stateMap.put("freeShotState", new FreeShotState());
    }

    public static State getState(String stateName){
        return stateMap.get(stateName);
    }

    public static State getReboundState(){
        return stateMap.get("reboundState");
    }

    public static State getFreeShotState(){
        return stateMap.get("freeShotState");
    }
}
