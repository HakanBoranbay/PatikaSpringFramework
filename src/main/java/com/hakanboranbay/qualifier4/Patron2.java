package com.hakanboranbay.qualifier4;

@QualifierMultiple2(EMultipleOptions.BIRINCI)
public class Patron2 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple 1 (Patron2) " + data;
    }

}
