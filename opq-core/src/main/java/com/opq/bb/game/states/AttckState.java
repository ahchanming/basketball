package com.opq.bb.game.states;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.AttackContext;
import com.opq.bb.game.module.GameContext;
import com.opq.bb.game.module.ShotContext;
import com.opq.bb.game.utils.GameUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by opq.chen on 2017/3/17.
 */
public class AttckState implements State{
    @Override
    public void handler(GameContext context) {
        AttackContext attackContext = context.getAttackContext();
        int selectIndex = GameUtil.random(5);
        ShotContext shotContext = new ShotContext();

        context.setShotContext(shotContext);
    }
}
