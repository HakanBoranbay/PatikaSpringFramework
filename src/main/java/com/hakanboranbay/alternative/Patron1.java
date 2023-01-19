package com.hakanboranbay.alternative;

import javax.enterprise.inject.Alternative;

@Alternative
public class Patron1 implements IPatron {

    // @Alternative: aynı anda sadece bir tane proje çalışıyor. diğerleri inactive durumda.
    @Override
    public String surum(String data) {
        return "Patron1 " + data;
    }

}
