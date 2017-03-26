package com.opq.bb.factorys;

import com.opq.bb.elements.member.Player;
import com.opq.bb.elements.skill.BaseSkill;

/**
 * Created by opq.chen on 2017/3/17.
 */
public class PlayerFactory {
    private static int playerIdIndex;
    static{
        //read player
    }

    private synchronized static int getAndIncPlayerIdIndex(){
        int ret = playerIdIndex;
        playerIdIndex += 1;
        return ret;
    }

    private static int getRandom(int l, int r){
        int len = r - l ;
        return (int)Math.round(l + Math.random() * len);
    }

    public static Player createPlayer(String name){
        Player player = new Player();
        player.setName(name);
        player.setId("" + player);
        BaseSkill baseSkill = player.getBaseSkill();
        baseSkill.setHeight(getRandom(170, 230));
        baseSkill.setRebound(getRandom(200, 700));
        baseSkill.setShot(getRandom(200, 700));
        baseSkill.setThreeShot(getRandom(200, 700));
        baseSkill.setFreeShot(getRandom(200, 700));
        baseSkill.setDribble(getRandom(200, 700));
        baseSkill.setPass(getRandom(200, 700));
        baseSkill.setBlock(getRandom(200, 700));
        baseSkill.setSteal(getRandom(200, 700));
        baseSkill.setRebound(getRandom(200, 700));

        baseSkill.setSpeed(getRandom(200, 700));
        baseSkill.setJump(getRandom(200, 700));
        baseSkill.setStrong(getRandom(200, 400));

        return player;
    }
}
