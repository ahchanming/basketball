package com.opq.bb.game.utils;

import com.opq.bb.elements.skill.BaseSkill;
import com.opq.bb.elements.skill.BaseSkillRate;

import java.util.List;
import java.util.Objects;

/**
 * Created by opq.chen on 2017/3/14.
 */
public class GameUtil {
    public static double calcSkill(BaseSkill baseSkill, BaseSkillRate rate){
        return baseSkill.getShot() * rate.getShot()
                + baseSkill.getThreeShot() * rate.getThreeShot()
                + baseSkill.getFreeShot() * rate.getFreeShot()
                + baseSkill.getDribble() * rate.getDribble()
                + baseSkill.getPass() * rate.getPass()
                + baseSkill.getBlock() * rate.getBlock()
                + baseSkill.getSteal() * rate.getSteal()
                + baseSkill.getSpeed() * rate.getSpeed()
                + baseSkill.getDump() * rate.getDump()
                + baseSkill.getStrong() * rate.getStrong()
                + baseSkill.getEnergy() * rate.getEnergy()
                + baseSkill.getHeight() * rate.getHeight()
                + baseSkill.getRebound() * rate.getRebound();
    }

    public static Integer getIndex(List<Double> abilities){
        double sum = abilities.stream().mapToDouble(Double::doubleValue).sum();
    }
}
