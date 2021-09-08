
/** VİRA BİSMİLLAH  
 * Java döngüler ile kullanıcının girdiği sayıya kadar çift olan sayıları bulan programı yazıyoruz.

 */
import java.util.*;

public class EvenNumber {

    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        ArrayList<Integer> dizi = new ArrayList();
        System.out.println("Enter Your Number");
        int sayi = number.nextInt();
        for (int i = 1; i < sayi; i++) {
            if (i % 2 == 0) {
                dizi.add(i);

            }
        }
        for (Integer j : dizi) {
            System.out.println("Even Numbers:" + j);
        }
        number.close();
    }
}