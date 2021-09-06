
/*  VİRA BİSMİLLAH

* Üç kenar uzunluğunu kullanıcıdan aldığınız üçgenin
* alanını hesaplayan programı yazınız.

@Author Yafeshan Ünal 06.09.2021
*/
import java.util.*;

public class DikKenarHipotenusu {

    public static void main(String[] args) {
        Scanner m = new Scanner(System.in);

        System.out.println("1.Kenarı Giriniz:");
        float edge1 = m.nextInt();
        System.out.println("2.Kenarı Giriniz:");
        float edge2 = m.nextInt();
        System.out.println("3.Kenarı Giriniz:");
        float edge3 = m.nextInt();

        float u = (edge1 + edge2 + edge3) / 2;
        double area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3)); // karekök hesabı için Math
                                                                              // kütüphanesinden sqrt kullanılmıştır
        System.out.println("Kenarları:" + edge1 + " " + edge2 + " " + edge3 + " Olan Üçgenin Alanı:" + area);
        m.close();
    }
}
