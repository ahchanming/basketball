package com.opq.bb.game.commentary;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by opq.chen on 2017/3/13.
 */
public class CommentaryFactory {
    private static Map<String, IComment> commentMap;
    static {
        commentMap = new HashMap<>();
        commentMap.put("freeShotComment", new FreeShotComment());
    }

    public static IComment getFreeShotComment(){
        return commentMap.get("freeShotComment");
    }
}
