package com.hakanboranbay.alternative;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "alternativedi")
@ApplicationScoped
public class Calisan {

    @Inject
    private IPatron iPatron;

    public String getData(String data) {
        return iPatron.surum(data);
    }

}
