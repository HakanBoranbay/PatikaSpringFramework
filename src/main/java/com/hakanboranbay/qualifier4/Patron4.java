package com.hakanboranbay.qualifier4;

import javax.enterprise.inject.Default;

@QualifierMultiple2(EMultipleOptions.UCUNCU)
public class Patron4 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple3 (Patron4) " + data;
    }

}
