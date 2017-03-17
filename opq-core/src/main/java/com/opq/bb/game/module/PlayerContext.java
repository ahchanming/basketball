package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;
import javafx.print.PageLayout;
import org.apache.commons.collections4.CollectionUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * 用来表示用户场上关系
 * Created by opq.chen on 2017/3/17.
 */
public class PlayerContext {
    private List<Player> homePlayers;
    private List<Player> guestPlayers;

    public PlayerContext(List<Player> homePlayers, List<Player> guestPlayers){
        this.homePlayers = homePlayers;
        this.guestPlayers = guestPlayers;
    }

    public List<Player> getHomePlayers() {
        return homePlayers;
    }

    public void setHomePlayers(List<Player> homePlayers) {
        this.homePlayers = homePlayers;
    }

    public List<Player> getGuestPlayers() {
        return guestPlayers;
    }

    public void setGuestPlayers(List<Player> guestPlayers) {
        this.guestPlayers = guestPlayers;
    }

    public List<Player> getHomePlayerOn(){
        return homePlayers.subList(0, 5);
    }

    public List<Player> getGuestPlayerOn(){
        return guestPlayers.subList(0, 5);
    }

}
