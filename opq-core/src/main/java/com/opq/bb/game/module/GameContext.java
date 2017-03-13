package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.states.State;

import java.util.List;

/**
 * A basketBall Game Context
 * Created by opq.chen on 2017/3/8.
 */
public class GameContext {
    private Integer ballControll;
    private List<String> outputs;
    private List<Player> homeTeamPlayers;
    private List<Player> guestTeamPlayers;
    private List<Player> selectA;
    private List<Player> selectB;
    private Integer selectTeam;
    private State gameState;
    private ShotContext shotContext;
    private ScoreStatistics scoreStatistics;

    public ScoreStatistics getScoreStatistics() {
        return scoreStatistics;
    }

    public void setScoreStatistics(ScoreStatistics scoreStatistics) {
        this.scoreStatistics = scoreStatistics;
    }

    public Integer getBallControll() {
        return ballControll;
    }

    public void setBallControll(Integer ballControll) {
        this.ballControll = ballControll;
    }

    public Integer getSelectTeam() {
        return selectTeam;
    }

    public void setSelectTeam(Integer selectTeam) {
        this.selectTeam = selectTeam;
    }

    public State getGameState() {
        return gameState;
    }

    public void setGameState(State gameState) {
        this.gameState = gameState;
    }

    public ShotContext getShotContext() {
        return shotContext;
    }

    public void setShotContext(ShotContext shotContext) {
        this.shotContext = shotContext;
    }

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

    public void execute(){
        this.getGameState().handler(this);
    }
}
