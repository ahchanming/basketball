package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/16.
 */
public class AttackContext {

    private boolean isFrontCourt;

    private List<Player> attackPlayers;

    private List<Player> defencePlayers;

    public List<Player> getAttackPlayers() {
        return attackPlayers;
    }

    public void setAttackPlayers(List<Player> attackPlayers) {
        this.attackPlayers = attackPlayers;
    }

    public List<Player> getDefencePlayers() {
        return defencePlayers;
    }

    public void setDefencePlayers(List<Player> defencePlayers) {
        this.defencePlayers = defencePlayers;
    }

    public boolean isFrontCourt() {
        return isFrontCourt;
    }

    public void setFrontCourt(boolean frontCourt) {
        isFrontCourt = frontCourt;
    }
}
