
/*  VİRA BİSMİLLAH 

 * N elemanlı bir kümenin elemanları ile oluşturulacak r elemanlı farklı grupların 
 * sayısı n’in r’li kombinasyonu olarak adlandırılır. N’in r’li kombinasyonu C(n,r) şeklinde gösterilir.
 ? Java ile kombinasyon hesaplayan program yazınız.
 ! C(n,r) = n! / (r! * (n-r)!)

*/
import java.util.*;

public class Combination {

    public static int factorial(int x) {
        if (x == 1) {
            return 1;
        }
        return factorial(x - 1) * x;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter to n:");
        int n = scan.nextInt();
        System.out.println("Enter to r");
        int r = scan.nextInt();
        int formül = factorial(n) / (factorial(r) * factorial(n - r));
        System.out.println("Combination Result:" + formül);
        scan.close();
    }
}