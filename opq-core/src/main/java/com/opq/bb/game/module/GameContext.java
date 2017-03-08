package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;

import java.util.List;

/**
 * A basketBall Game Context
 * Created by opq.chen on 2017/3/8.
 */
public class GameContext {
    private List<String> outputs;
    private List<Player> homeTeamPlayers;
    private List<Player> guestTeamPlayers;
    private List<Player> selectA;
    private List<Player> selectB;

    public List<String> getOutputs() {
        return outputs;
    }

    public void setOutputs(List<String> outputs) {
        this.outputs = outputs;
    }

    public List<Player> getHomeTeamPlayers() {
        return homeTeamPlayers;
    }

    public void setHomeTeamPlayers(List<Player> homeTeamPlayers) {
        this.homeTeamPlayers = homeTeamPlayers;
    }

    public List<Player> getGuestTeamPlayers() {
        return guestTeamPlayers;
    }

    public void setGuestTeamPlayers(List<Player> guestTeamPlayers) {
        this.guestTeamPlayers = guestTeamPlayers;
    }

    public List<Player> getSelectA() {
        return selectA;
    }

    public void setSelectA(List<Player> selectA) {
        this.selectA = selectA;
    }

    public List<Player> getSelectB() {
        return selectB;
    }

    public void setSelectB(List<Player> selectB) {
        this.selectB = selectB;
    }
}
