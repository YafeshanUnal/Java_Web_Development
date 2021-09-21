
/*  VİRA BİSMİLLAH
 * 
 * Java dilinde kullanıcıdan alınan n değerine göre aşağıdaki kurala uyan döngü kullanmadan bir "Recursive" metot yazın.
 ? Kural : Girilen sayı 0 veya negatif olduğu yere kadar girilen sayıdan 5 rakamını çıkarın.
 ? Her çıkarma işlemi sırasında ekrana son değeri yazdırın.
 ? Sayı negatif veya 0 olduktan sonra tekrar 5 ekleyin. 
 ? Yine her ekleme işleminde sayının son değerini ekrana yazdırın.



 */
import java.util.*;

public class RecursiveSubtract5 {
    private static int temp;

    static int substract(int x) {

        if (0 < x && temp == 0) {
            return x - 5;
        } else {
            temp = 1;
            return substract(x) + 5;
        }

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Value to N Number:");
        int temp;
        int n = scan.nextInt();
        for (int i = 0; i < 10; i++) {
            temp = arr.get(i);
            temp = substract(n);
            System.out.println(temp);

        }

        // int n1 = substract(n);
        // System.out.println(n1);
        // int n2 = substract(n1);
        // System.out.println(n2);
        // int n3 = substract(n2);
        // System.out.println(n3);
        // int n4 = substract(n3);
        // System.out.println(n4);
        // int n5 = substract(n4);
        // System.out.println(n5);
        // int n6 = substract(n5);
        // System.out.println(n6);

        scan.close();
    }
}
