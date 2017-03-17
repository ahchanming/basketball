package com.opq.bb.game.states;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by vickeyjchen on 2017/3/11.
 */
public class StateFactory {
    public interface TYPE{
        String REBOUND_STATE = "reboudState";
        String FREE_SHOT_STATE = "freeShotState";
        String TWO_POINT_SHOT_STATE = "twoPointShotState";
        String START_BALL_STATE = "startBallState";
        String FIGHT_4_BALL_STATE = "fight4BallState";
        String ATTACK_STATE = "attackState";
    }
    private static Map<String, State> stateMap;
    static {
        stateMap = new HashMap<>();
        stateMap.put(TYPE.REBOUND_STATE, new ReboundState());
        stateMap.put("freeShotState", new FreeShotState());
        stateMap.put(TYPE.TWO_POINT_SHOT_STATE, new TwoPointShotState());
        stateMap.put(TYPE.FIGHT_4_BALL_STATE, new Fight4BallState());
        stateMap.put(TYPE.START_BALL_STATE, new StartBallState());
        stateMap.put(TYPE.ATTACK_STATE, new AttckState());
    }

    public static State getState(String stateName){
        return stateMap.get(stateName);
    }

    public static State getReboundState(){
        return stateMap.get(TYPE.REBOUND_STATE);
    }

    public static State getFreeShotState(){
        return stateMap.get("freeShotState");
    }

    public static State getTwoPointShotState(){
        return stateMap.get(TYPE.TWO_POINT_SHOT_STATE);
    }

    public static State getStartBallState(){
        return stateMap.get(TYPE.START_BALL_STATE);
    }

    public static State getFight4BallState(){
        return stateMap.get(TYPE.FIGHT_4_BALL_STATE);
    }

    public static State getAttackState(){
        return stateMap.get(TYPE.ATTACK_STATE);
    }
}
