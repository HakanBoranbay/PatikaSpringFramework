package com.hakanboranbay.cdi;

import javax.enterprise.context.*;
import javax.inject.Named;
import java.io.Serializable;

// Kapsam
// Yaşam süresi
// hangi scope'u seçtiğimiz performansımızı olumlu olumsuz etkiler
@Named(value = "scopedtuto")
// @ApplicationScoped // bütün uygulama boyunca çalışıyor, bütün kullanıcılar için
// @RequestScoped // bir istek boyunca yaşar.
// @SessionScoped // bir kullanıcı için yaşar ancak logout olduğu zaman ölür. Bir bean'in instance olmasını sağlamak için
// @Dependent // bukalemun gibidir. bulunmuş olduğu yapı hangi scopeta ise ona göre yaşar.
// @ConversationScoped // belli istekler boyunca yaşar. (sepete eklenen ürün ödeme yapılınca silinir.)
public class _00_Scoped {
}
