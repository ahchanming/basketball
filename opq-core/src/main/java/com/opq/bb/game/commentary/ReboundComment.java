package com.opq.bb.game.commentary;

import com.opq.bb.elements.member.Player;

/**
 * Created by opq.chen on 2017/3/16.
 */
public class ReboundComment {
    public String getComment(Player player){
        return player.getName() + "摘下篮板";
    }
}
