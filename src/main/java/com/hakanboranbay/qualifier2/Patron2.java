package com.hakanboranbay.qualifier2;

@QualifierMultiple
public class Patron2 implements IPatron {

    @Override
    public String surum(String data) {
        return "QualifierMultiple 1 (Patron2) " + data;
    }

}
