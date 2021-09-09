
/*   VİRA BİSMİLLAH
 * 
 *  Java ile girilen sayının harmonik serisini bulan program yazınız.


 * 
 */
import java.util.*;

public class HarmonikNumber {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.print("Enter the Number:");
        int sayi = temp.nextInt();

        double result = 0.0;

        for (double i = 1; i <= sayi; i++) {
            result += (1 / i);
        }
        System.out.println("Result:" + result);
        temp.close();
    }
}
