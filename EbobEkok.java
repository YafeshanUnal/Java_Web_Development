
/*  VİRA BİSMİLLAH
 * 
 * Java ile iki sayının EBOB ve EKOK değerlerini "While Döngüsü" kullanarak yazınız.
 
 */
import java.util.*;

public class EbobEkok {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        ArrayList<Integer> dizi = new ArrayList<>();
        ArrayList<Integer> dizi1 = new ArrayList<>();

        System.out.print("Enter the First Number:");
        int s1 = number.nextInt();
        System.out.print("Enter the Second Number:");
        int s2 = number.nextInt();
        int k = 1, i = 1;
        // ? EBOB
        while (i <= s1) {
            if (s1 % i == 0 && s2 % i == 0) {
                dizi.add(i);
            }
            i++;
        }
        // ? EKOK
        while (k <= (s1 * s2)) {
            if (k % s1 == 0 && k % s2 == 0) {
                dizi1.add(k);
            }
            k++;
        }
        for (Integer j : dizi) {
            System.out.println("Ebob Numbers:" + j);
        }
        for (Integer m : dizi1) {
            System.out.println("Ekok Numbers:" + m);
        }
        number.close();
    }
}
