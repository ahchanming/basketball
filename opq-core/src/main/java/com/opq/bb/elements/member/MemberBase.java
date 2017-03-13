package com.opq.bb.elements.member;


/**
 * Created by opq.chen on 2017/3/8.
 */

public class MemberBase {
    /**
     * name
     */
    private String name;

    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
