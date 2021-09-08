
/*  VİRA BİSMİLLAH 
 * 
 * Java döngüler ile girilen sayıya kadar olan 4 ve 5'in kuvvetlerini ekrana yazdıran programı yazıyoruz.

*/
import java.util.*;

public class PowerFourFive {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        System.out.print("Enter Your Numbers:");
        int sayi = number.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (i % 4 == 0 && i % 5 == 0) {
                System.out.println("Partner Numbers:" + i);
            }
            number.close();
        }
    }
}
