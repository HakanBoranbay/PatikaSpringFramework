package com.hakanboranbay.qualifier4;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

@Named(value = "qualifier4cdi")
@ApplicationScoped
public class Calisan {

    /**
    // defaultta çalışacak kodlar
    @Inject
    private IPatron iPatron;
    */

    /**
    // istediğimiz seçenek
    // BIRINCI
    @Inject
    @QualifierMultiple2(EMultipleOptions.BIRINCI)
    private IPatron iPatron;
    */

    /**
    // istediğimiz seçenek
    // IKINCI
    @Inject
    @QualifierMultiple2(EMultipleOptions.IKINCI)
    private IPatron iPatron;
    */

    // istediğimiz seçenek
    // UCUNCU
    @Inject
    @QualifierMultiple2(EMultipleOptions.UCUNCU)
    private IPatron iPatron;

    public String getData(String data) {
        return iPatron.surum(data);
    }

}
