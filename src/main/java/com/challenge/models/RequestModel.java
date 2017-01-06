package com.challenge.models;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by ryanhill on 1/5/17.
 */
public class RequestModel {

    @JsonProperty("num1")
    private String num1;

    @JsonProperty("num2")
    private String num2;

    public String getNum1() {
        return num1;
    }

    public void setNum1(String num1) {
        this.num1 = num1;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }
}
