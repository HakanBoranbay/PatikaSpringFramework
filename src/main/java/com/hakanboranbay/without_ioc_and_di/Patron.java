package com.hakanboranbay.without_ioc_and_di;

public class Patron {

    // Burada yapılacak değişiklikler bağlı classlarda adapte olamayacaktır. Yönetimi patrona bırakmak IOC'dir.
    public String surum(String data) {
        return "sürüm" + data;
    }

}
