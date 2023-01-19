package com.hakanboranbay.qualifier4;

import javax.enterprise.inject.Default;

@QualifierMultiple2(EMultipleOptions.IKINCI)
public class Patron3 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple2 (Patron2) " + data;
    }

}
