package com.hakanboranbay.without_ioc_and_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;

@Named(value = "cdisizcalisan")
@ApplicationScoped
public class Calisan {

    private Patron patron;

    // Parametresiz constructor
    public Calisan() {
        patron = new Patron();
    }

    public String getData(String data) {
        return patron.surum("17");
    }
}
