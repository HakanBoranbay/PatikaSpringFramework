package com.hakanboranbay.qualifier;

import javax.enterprise.inject.Default;

@Default
public class Patron1 implements IPatron {

    @Override
    public String surum(String data) {
        return "Default (Patron1) " + data;
    }

}
