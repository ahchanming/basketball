package com.opq.bb.game.commentary;

import com.opq.bb.elements.member.Player;
import com.opq.bb.game.module.GameContext;
import org.apache.commons.collections4.CollectionUtils;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class TwoPointShotComment implements IComment{
    @Override
    public String getComment(GameContext context, Integer result) {
        Player aPlayer = context.getSelectA().get(0);
        Player dPlayer = null;
        if (CollectionUtils.isNotEmpty(context.getSelectB())){
            dPlayer = context.getSelectB().get(0);
        }
        if (0 == result){
            return aPlayer.getName() + "高高跃起， 短了！";
        }else{
            return aPlayer.getName() + "拿球就投， 有了";
        }
    }
}
