
/*  VİRA BİSMİLLAH
 * 
 * Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan
 *  ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.”
 *  değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

? Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların) 
? toplamı kendisine eşit olan sayıya mükemmel sayı denir.
*/
import java.util.*;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int sayi = input.nextInt();
        int toplam = 0;
        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }

        }
        if (sayi == toplam) {
            System.out.println("Your Number a Perfect Number:" + sayi);
        } else {
            System.out.println("Your Number not a Perfect Number:(");
        }
        input.close();
    }
}
