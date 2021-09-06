
/*  VİRA BİSMİLLAH
*
* Java ile kullanıcıdan alınan para değerinin 
* KDV'li fiyatını ve KDV tutarını hesaplayıp ekrana bastıran programı yazın.
* Eğer girilen tutar 0 ve 1000 TL arasında ise KDV oranı %18
* tutar 1000 TL'den büyük ise KDV oranını %8 olarak KDV tutarı hesaplayan programı yazınız.
*/
import java.util.*;

public class KdvHesapla {
    public static void main(String[] args) {
        Scanner money = new Scanner(System.in);
        System.out.print("Kdv'si Hesaplanacak Para Miktarını Giriniz:");
        int para = money.nextInt();
        boolean flag = para > 1000;
        System.out.println("Kdv'li Fiyat:" + (flag == true ? para * 18 / 100 : para * 8 / 100));

        money.close();
    }
}
