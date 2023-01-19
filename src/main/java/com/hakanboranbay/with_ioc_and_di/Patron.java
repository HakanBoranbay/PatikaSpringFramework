package com.hakanboranbay.with_ioc_and_di;

public class Patron implements IPatron {

    @Override
    public String surum(String data) {
        return "Sürüm " + data;
    }

}
