package com.itvdn.json.homework.homeworkAdd.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.math.BigDecimal;

public class Currency {
    @JsonProperty("r030")
    private String id;
    @JsonProperty("txt")
    private String name;
    @JsonProperty("cc")
    private String code;
    @JsonProperty("rate")
    private BigDecimal rate;
    @JsonProperty("exchangedate")
    private String exchangedate;

    public Currency() {
    }

    public Currency(String id, String name, String code, BigDecimal rate, String exchangedate) {
        this.id = id;
        this.name = name;
        this.code = code;
        this.rate = rate;
        this.exchangedate = exchangedate;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public BigDecimal getRate() {
        return rate;
    }

    public void setRate(BigDecimal rate) {
        this.rate = rate;
    }

    public String getExchangedate() {
        return exchangedate;
    }

    public void setExchangedate(String exchangedate) {
        this.exchangedate = exchangedate;
    }

    @Override
    public String toString() {
        return "Currency{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", code='" + code + '\'' +
                ", rate='" + rate + '\'' +
                ", exchangedate='" + exchangedate + '\'' +
                '}';
    }
}

