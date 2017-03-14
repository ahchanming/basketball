package com.opq.bb.elements.skill;

/**
 * Created by opq.chen on 2017/3/14.
 */
public class BaseSkillRate{
    private double shot;
    private double threeShot;
    private double freeShot;
    private double dribble;
    private double pass;

    //defence
    private double block;
    private double steal;
    private double rebound;

    //base
    private double speed;
    private double dump;
    private double strong;
    private double energy;
    private double height;

    public double getRebound() {
        return rebound;
    }

    public void setRebound(double rebound) {
        this.rebound = rebound;
    }

    public double getShot() {
        return shot;
    }

    public void setShot(double shot) {
        this.shot = shot;
    }

    public double getThreeShot() {
        return threeShot;
    }

    public void setThreeShot(double threeShot) {
        this.threeShot = threeShot;
    }

    public double getFreeShot() {
        return freeShot;
    }

    public void setFreeShot(double freeShot) {
        this.freeShot = freeShot;
    }

    public double getDribble() {
        return dribble;
    }

    public void setDribble(double dribble) {
        this.dribble = dribble;
    }

    public double getPass() {
        return pass;
    }

    public void setPass(double pass) {
        this.pass = pass;
    }

    public double getBlock() {
        return block;
    }

    public void setBlock(double block) {
        this.block = block;
    }

    public double getSteal() {
        return steal;
    }

    public void setSteal(double steal) {
        this.steal = steal;
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getDump() {
        return dump;
    }

    public void setDump(double dump) {
        this.dump = dump;
    }

    public double getStrong() {
        return strong;
    }

    public void setStrong(double strong) {
        this.strong = strong;
    }

    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        this.energy = energy;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
}
