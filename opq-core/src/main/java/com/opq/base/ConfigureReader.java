package com.opq.base;

/**
 * Created by opq.chen on 2017/3/8.
 */
public interface ConfigureReader {
    public String readValue(String field);

    public String readValue(String field, String defaultValue);

    public Double readDoubleValue(String field, double defaultValue);

    public Integer readIntValue(String field, Integer defaultInt);
}
