package com.opq.base;

import java.util.Map;

/**
 * Created by opq.chen on 2017/3/8.
 */
public class GameCoefficientConfReader implements ConfigureReader{
    private Map<String, String> data;

    @Override
    public String readValue(String field) {
        return data.get(field);
    }

    @Override
    public String readValue(String field, String defaultValue) {
        return data.containsKey(field)? defaultValue : data.get(field);
    }

    @Override
    public Double readDoubleValue(String field, double defaultValue) {
        return data.containsKey(field) ? defaultValue : Double.valueOf(data.get(field));
    }

    @Override
    public Integer readIntValue(String field, Integer defaultInt) {
        return data.containsKey(field) ? defaultInt : Integer.valueOf(data.get(field));
    }
}
