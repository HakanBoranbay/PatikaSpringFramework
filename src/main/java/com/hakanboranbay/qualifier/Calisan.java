package com.hakanboranbay.qualifier;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifiercdi")
@ApplicationScoped
public class Calisan {

    /**
    // defaultta çalışacak kodlar
    @Inject
    private IPatron iPatron;
    */

    // defaultta çalışacak kodlar
    @Inject
    @QualifierMultiple
    private IPatron iPatron;

    public String getData(String data) {
        return iPatron.surum(data);
    }

}
