package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;

import java.util.List;

/**
 * Created by opq.chen on 2017/3/16.
 */
public class StartBallContext {
    private boolean isFrontCourt;
    private List<Player> selectA;
    private List<Player> selectB;

    public boolean isFrontCourt() {
        return isFrontCourt;
    }

    public void setFrontCourt(boolean frontCourt) {
        isFrontCourt = frontCourt;
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
