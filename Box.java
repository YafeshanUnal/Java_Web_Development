paket boxingMatch;

public class Fighter {
    dize adı;
    int hasar;
    int sağlık;
    int ağırlık;
    çift atlatmak;

    public Fighter(String name, int damage, int sağlık, int ağırlık, double dodge) {
        bu.isim = isim;
        bu.hasar = hasar;
        bu.sağlık = sağlık;
        bu.ağırlık = ağırlık;
        bu.atlatmak = atlatmak;
    }

    public  int  hit ( Dövüşçü  düşmanı ) {
        Sistem . dışarı . println( " ------------ " );
        Sistem . dışarı . println( bu . isim +  " => "  + düşman . isim +  "  "  +   bu . hasar +  " kaza vurdu. " );

        Eğer (düşmanı . atlatmak ()) {
            Sistem . dışarı . println(düşman . name +  " gelen olay savurdu. " );
            düşmana dön . sağlık;
        }

        if (düşman . sağlık -  bu . hasar <  0 )
            geri  0 ;

        düşmana dön . sağlık -  bu . hasar;
    }

    genel  boole

    atlatmak () {
        double randomValue =  Matematik . rastgele() *  100 ;  // 0.0 - 99.9
        Dönüş randomValue <=  bu . atlatmak;
    }
}