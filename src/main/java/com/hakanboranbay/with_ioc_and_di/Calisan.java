package com.hakanboranbay.with_ioc_and_di;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "cdiliCalisan")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron iPatron;

    public Calisan() {
        // patron = new Patron();
    }

    public String getData(String data) {
        return iPatron.surum(data);
    }

}
