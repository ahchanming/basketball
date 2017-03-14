package com.opq.bb.game.module;

import com.opq.bb.elements.member.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class ScoreStatistics {
    public interface SHOT_TYPE{
        Integer FREE_SHOT = 0;
        Integer TWP_POINT_SHOT = 1;
    }

    private Integer homeTeamScore;
    private Integer guestTeamScore;
    private Map<String, PlayerStatistics> homePlayerStatisticsMap;
    private Map<String, PlayerStatistics> guestPlayerStatisticsMap;

    public ScoreStatistics(List<Player> homePlayers, List<Player> guestPlayers){
        homeTeamScore = 0;
        guestTeamScore = 0;
        homePlayerStatisticsMap = new HashMap<>(homePlayers.size());
        guestPlayerStatisticsMap = new HashMap<>(guestPlayers.size());
        for (Player player : homePlayers){
            homePlayerStatisticsMap.put(player.getId(), new PlayerStatistics());
        }
        for (Player player : guestPlayers){
            guestPlayerStatisticsMap.put(player.getId(), new PlayerStatistics());
        }
    }

    public void playerShot(Player player, Integer type, int Result){
        boolean isHome = true;
        PlayerStatistics statistics= homePlayerStatisticsMap.get(player.getId());
        if (statistics == null){
            statistics = guestPlayerStatisticsMap.get(player.getId());
            isHome = false;
        }
        if (type.equals(SHOT_TYPE.FREE_SHOT)){
            statistics.setFreeShotTotal(statistics.getFreeShotTotal() + 1);
            if (1 == Result){
                statistics.setScore(statistics.getScore() + 1);
                statistics.setFreeShotIn(statistics.getFreeShotIn() + 1);
                if (isHome){
                    homeTeamScore += 1;
                }else{
                    guestTeamScore += 1;
                }
            }
        }
        if (type.equals(SHOT_TYPE.TWP_POINT_SHOT)){
            statistics.incTwoPointShotTotal();
            if (1 == Result){
                statistics.incScore(2);
                statistics.incTwoPointShotIn();
                if (isHome){
                    homeTeamScore += 2;
                }else{
                    guestTeamScore += 2;
                }
            }
        }
    }

    public static class PlayerStatistics{
        private int score;
        private int twoPointShotTotal;
        private int twoPointShotIn;
        private int threePointShotTotal;
        private int threePointShotIn;
        private int freeShotTotal;
        private int freeShotIn;

        public void incScore(int x){
            score += x;
        }

        public void incTwoPointShotTotal(){
            twoPointShotTotal += 1;
        }

        public void incTwoPointShotIn(){
            twoPointShotIn += 1;
        }

        public void incThreePointShotTotal(){
            threePointShotTotal += 1;
        }

        public void incThreePointShotIn(){
            twoPointShotIn += 1;
        }

        public void incFreeShotTotal(){
            freeShotTotal += 1;
        }

        public void incFreeShotIn(){
            freeShotIn += 1;
        }

        public int getScore() {
            return score;
        }

        public void setScore(int score) {
            this.score = score;
        }

        public int getTwoPointShotTotal() {
            return twoPointShotTotal;
        }

        public void setTwoPointShotTotal(int twoPointShotTotal) {
            this.twoPointShotTotal = twoPointShotTotal;
        }

        public int getTwoPointShotIn() {
            return twoPointShotIn;
        }

        public void setTwoPointShotIn(int twoPointShotIn) {
            this.twoPointShotIn = twoPointShotIn;
        }

        public int getThreePointShotTotal() {
            return threePointShotTotal;
        }

        public void setThreePointShotTotal(int threePointShotTotal) {
            this.threePointShotTotal = threePointShotTotal;
        }

        public int getThreePointShotIn() {
            return threePointShotIn;
        }

        public void setThreePointShotIn(int threePointShotIn) {
            this.threePointShotIn = threePointShotIn;
        }

        public int getFreeShotTotal() {
            return freeShotTotal;
        }

        public void setFreeShotTotal(int freeShotTotal) {
            this.freeShotTotal = freeShotTotal;
        }

        public int getFreeShotIn() {
            return freeShotIn;
        }

        public void setFreeShotIn(int freeShotIn) {
            this.freeShotIn = freeShotIn;
        }
    }
}
