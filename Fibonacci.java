
/*  VİRA BİSMİLLAH
 * 
 * Java döngüler ile fibonacci serisi bulan program yazıyoruz.
 ? Fibonacci serisinin eleman sayısını kullanıcıdan alın.

 */
import java.util.*;

public class Fibonacci {
    static int fibonacci(int x) {
        if (x <= 1) {
            return 1;
        }
        return fibonacci(x - 1) + fibonacci(x - 2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number for which you want to find the Fibonacci sum:");
        int i = sc.nextInt();
        System.out.println("Total Fibonacci:" + fibonacci(i));
        sc.close();

    }
}
