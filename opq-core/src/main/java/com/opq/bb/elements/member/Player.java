package com.opq.bb.elements.member;

import com.opq.bb.elements.interfaces.BallSkillHandler;
import com.opq.bb.elements.skill.BaseSkill;

/**
 * Created by opq.chen on 2017/3/8.
 */
public class Player extends MemberBase implements BallSkillHandler {
    private BaseSkill baseSkill;
    private BaseSkill upperLimitBaseSkill;


    @Override
    public BaseSkill getBaseSkill() {
        return this.baseSkill;
    }

    @Override
    public BaseSkill getUpperLimitBaseSkill() {
        return null;
    }
}
