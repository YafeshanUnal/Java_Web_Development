
/*  VİRA BİSMİLLAH
* Java koşullu ifadeler ile kullanıcının not durumuna göre sınıfı geçme durumunu hesaplayan program yapımı.


? Dersler : Matematik, Fizik, Türkçe, Kimya, Müzik
! Geçme Notu : 55

* Eğer girilen ders notları 0 veya 100 arasında değil ise ortalamaya katılmasın.
*/
import java.util.*;

public class PassTheClass {
    public static void main(String[] args) {
        Scanner not = new Scanner(System.in);
        float toplam = 0;
        for (int i = 1; i < 6; i++) {
            System.out.println(i + ".Enter Your Lesson Grade");
            float m = not.nextFloat();
            if (0 <= m && m <= 100) {
                toplam += m;

            } else {
                continue;
            }
        }
        boolean flag = toplam / 5 > 55;
        System.out.println("Passing Grade:" + toplam / 5 + (flag == true ? "\n\tPassed" : "\n\tLeft"));

        not.close();
    }
}
