
/*  VİRA BİSMİLLAH
* Java ile bir sayının "Palindrom Sayı" olup olmadığını bulan bir program yapıyoruz.

*/
import java.util.*;

public class Palindrom {

    static boolean palindrom(int sayi) {
        int temp = sayi, fNumber = 0, sNumber;
        while (temp != 0) {
            sNumber = temp % 10;
            fNumber = (fNumber * 10) + sNumber;

            temp /= 10;

        }
        if (sayi == fNumber)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int sayi = sc.nextInt();
        System.out.println("Your Number:" + palindrom(sayi));
        sc.close();

    }

}
