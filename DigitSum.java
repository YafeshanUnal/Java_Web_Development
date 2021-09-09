
/*  VİRA BİSMİLLAH
 * 
 * Bir sayının basamak sayılarının toplamını hesaplayan program yazınız. 
 */
import java.util.*;

public class DigitSum {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter the Number find the Dİgit Sum:");
        int sayi = number.nextInt();
        int toplam = 0;

        toplam += (sayi % 10);
        sayi = sayi / 10;
        toplam += (sayi % 10);
        sayi = sayi / 10;
        // toplam += (sayi % 10);
        if (sayi % 10 < 10) {
            toplam += sayi % 10;
        }

        System.out.println("Sum:" + toplam);
        number.close();
    }
}
