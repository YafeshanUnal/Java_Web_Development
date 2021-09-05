
/** VİRA BİSMİLLAH
 * 
 * OrtalamaHesapla
 * Aynı program içerisinde koşullu ifadeler kullanılarak, 
 * eğer kullanıcının ortalaması 60'dan büyük ise ekrana "Sınıfı Geçti" , küçük ise "Sınıfta Kaldı" yazsın.
  
 * Not : If ve Else kullanılmayacak...
*/
import java.util.Scanner;

public class OrtalamaHesapla {

    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        double toplam = 0;

        for (int i = 1; i < 6; i++) {
            System.out.println(i + ".Ders Notunuzu Giriniz:");
            toplam += temp.nextInt();
        }
        boolean flag = toplam / 6 >= 60;
        System.out.println("Sonuç:" + (flag == true ? "Geçti" : "Kaldı")); // lambda fonksiyon kullanımı
        temp.close();
    }
}