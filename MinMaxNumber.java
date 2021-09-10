
/*  VİRA BİSMİLLAH
 * 
 * Java ile klavyeden girilen N tane sayma sayısından en büyük ve en küçük sayıları
 * bulan ve bu sayıları ekrana yazan programı yazın.
 */
import java.util.*;

public class MinMaxNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Numbers will u Enter:");
        int s = input.nextInt();
        int[] arr = new int[s];

        for (int i = 0; i < s; i++) {
            System.out.print("Enter the Numbers:");
            arr[i] = input.nextInt();

        }
        int min = arr[0];
        int max = arr[0];

        for (int j = 0; j < s; j++) {
            if (arr[j] < min) {
                min = arr[j];
            }
            if (arr[j] > max) {
                // max = arr[j];
                arr[j] = max;
            }
        }

        System.out.println("Minimum Nunber:" + min + "\nMaximum Number:" + max);

        input.close();

    }

}
