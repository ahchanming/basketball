package com.opq.bb.elements.skill;

/**
 * Created by opq.chen on 2017/3/8.
 */
public class BaseSkill {
    //attack
    private int shot;
    private int threeShot;
    private int freeShot;
    private int dribble;
    private int pass;

    //defence
    private int block;
    private int steal;
    private int rebound;

    //base
    private int speed;
    private int jump;
    private int strong;
    private int energy;
    private int height;

    public int getRebound() {
        return rebound;
    }

    public void setRebound(int rebound) {
        this.rebound = rebound;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getShot() {
        return shot;
    }

    public void setShot(int shot) {
        this.shot = shot;
    }

    public int getThreeShot() {
        return threeShot;
    }

    public void setThreeShot(int threeShot) {
        this.threeShot = threeShot;
    }

    public int getFreeShot() {
        return freeShot;
    }

    public void setFreeShot(int freeShot) {
        this.freeShot = freeShot;
    }

    public int getDribble() {
        return dribble;
    }

    public void setDribble(int dribble) {
        this.dribble = dribble;
    }

    public int getPass() {
        return pass;
    }

    public void setPass(int pass) {
        this.pass = pass;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public int getSteal() {
        return steal;
    }

    public void setSteal(int steal) {
        this.steal = steal;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getJump() {
        return jump;
    }

    public void setJump(int jump) {
        this.jump = jump;
    }

    public int getStrong() {
        return strong;
    }

    public void setStrong(int strong) {
        this.strong = strong;
    }

    public int getEnergy() {
        return energy;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }
}
