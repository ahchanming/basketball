package com.example.test.utils;

import com.opq.bb.elements.member.Player;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/16.
 */
public class PlayerUtil {
    public static List<Player> getHomeTeamPlayers(){
        List<Player> list = new ArrayList<>();
        Player player = new Player();
        player.setName("opq.chen");
        player.setId("000001");
        player.getBaseSkill().setHeight(170);
        player.getBaseSkill().setStrong(160);
        player.getBaseSkill().setRebound(800);
        player.getBaseSkill().setJump(300);
        list.add(player);
        return list;
    }


    public static List<Player> getGuestTeamPlayers(){
        List<Player> list = new ArrayList<>();
        Player player = new Player();
        player.setName("qop.chen");
        player.setId("000002");
        player.getBaseSkill().setHeight(180);
        player.getBaseSkill().setStrong(166);
        player.getBaseSkill().setRebound(700);
        player.getBaseSkill().setJump(400);
        list.add(player);
        return list;
    }

}
