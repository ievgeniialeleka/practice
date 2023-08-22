package com.hillel.patterns.singlton.cache;

public enum Currency {
    EUR("€"),
    USD("$"),
    GBP("£"),
    UAH("₴");

    private String sign;

    Currency(String sign) {
        this.sign = sign;
    }

    public String getSign() {
        return sign;
    }
}
