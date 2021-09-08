
/** VİRA BİSMİLLAH
 
 * Java döngüler ile tek bir sayı girilene kadar kullanıcıdan girişleri kabul eden
 *  ve girilen değerlerden çift ve 4'ün katları olan sayıları toplayıp ekrana basan programı yazıyoruz.


 
 */
import java.util.*;

public class OddNumber {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        int toplam = 0;
        System.out.println("Enter Your Numbers");
        int sayi = temp.nextInt();
        if (sayi % 2 == 0 && sayi % 4 == 0) {
            toplam += sayi;
        }

        while (sayi % 2 == 0) {
            System.out.println("Enter Your Numbers");
            sayi = temp.nextInt();
            if (sayi % 2 == 0 && sayi % 4 == 0) {
                toplam += sayi;
            }
        }
        System.out.println("Numbers:" + toplam);
        temp.close();
    }
}
