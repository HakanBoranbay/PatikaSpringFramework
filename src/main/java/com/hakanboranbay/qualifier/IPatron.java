package com.hakanboranbay.qualifier;

public interface IPatron {


    // @Alternative: aynı anda sadece 1 tane proje çalışıyor diğerleri kapalı
    // @Qualifier: aynı anda birden fazla proje aktif ama default olarak çalışacak projeyi seçebiliyoruz.

    public String surum(String data);

}
