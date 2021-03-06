package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;

/**
 * Created by opq.chen on 2017/3/10.
 */
public class ShotContext {
    private Integer freeShotTime;
    private Player assistPlayer;

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
