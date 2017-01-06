package com.challenge.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ryanhill on 1/5/17.
 */
public class ResponseModel {

    @JsonProperty("index")
    private int index;

    @JsonProperty("value")
    private String value;

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
