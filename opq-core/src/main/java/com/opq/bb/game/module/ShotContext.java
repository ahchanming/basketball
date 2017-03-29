package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class ShotContext {
    private Integer freeShotTime;
    private Player assistPlayer;
    private Player shotPlayer;
    private List<Player> defencePlayers;

    public List<Player> getDefencePlayers() {
        return defencePlayers;
    }

    public void setDefencePlayers(List<Player> defencePlayers) {
        this.defencePlayers = defencePlayers;
    }

    public Player getShotPlayer() {
        return shotPlayer;
    }

    public void setShotPlayer(Player shotPlayer) {
        this.shotPlayer = shotPlayer;
    }

    public Player getAssistPlayer() {
        return assistPlayer;
    }

    public void setAssistPlayer(Player assistPlayer) {
        this.assistPlayer = assistPlayer;
    }

    public Integer getFreeShotTime() {
        return freeShotTime;
    }

    public void setFreeShotTime(Integer freeShotTime) {
        this.freeShotTime = freeShotTime;
    }
}
