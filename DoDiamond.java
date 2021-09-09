
/*  VİRA BİSMİLLAH
 * 
 *  Java'da döngüler kullanarak yıldızlar ile elmas yapınız.
 
 */
import java.util.*;

public class DoDiamond {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("How many Diamonds Do u want to Create");
        int diamond = temp.nextInt();

        for (int i = 1; i < diamond; i++) {

            for (int j = 1; j <= diamond - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= (2 * i) - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        int m = 1;
        for (int i = diamond - 2; i >= 0; i--) {

            for (int k = 0; k <= m; k++) {
                System.out.print(" ");
            }

            for (int j = 2 * i - 1; j > 0; j--) {
                System.out.print("*");
            }

            System.out.println();
            m++;

        }
        temp.close();
    }
}
