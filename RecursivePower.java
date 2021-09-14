
/*  VİRA BSİMİLLAH
 * 
 * Java dilinde, taban ve üs değerleri kullanıcıdan alınan üs alma işlemini
 ! "Recursive" metot kullanarak yapan programı yazınız.

 */
import java.util.*;

public class RecursivePower {

    static int recursivePower(int x, int y) {
        if (x == 1)
            return 1;
        else if (y == 0)
            return 1;
        else
            return x * recursivePower(x, y - 1);

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Base of Number:");
        int base = scan.nextInt();
        System.out.print("Enter the Power of Number:");
        int power = scan.nextInt();
        System.out.println("Result:" + recursivePower(base, power));
        scan.close();

    }

}
