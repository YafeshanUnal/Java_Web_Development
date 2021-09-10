
/*  VİRA BİSMİLLAH
 * 
 * Java ile basamak sayısının kullanıcıdan alınan 
 * ve döngüler kullanılarak, 
 ! yıldızlar(*) ile ekrana ters üçgen çizen programı yazın.

 */
import java.util.*;

public class InvertedTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Stars Number:");
        int stars = sc.nextInt();

        for (int i = stars; i >= 1; i--) {

            for (int j = 1; j <= stars - i; j++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= 2 * i - 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        sc.close();
    }

}
