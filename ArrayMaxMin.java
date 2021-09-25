
/**
 * Dizideki elemanların girilen sayıdan küçük en yakın sayıyı ve en büyük en yakın sayıyı bulan programı yazınız.


 * ArrayMaxMin
 */
import java.util.*;

public class ArrayMaxMin {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        ArrayList<Integer> SmallArray = new ArrayList<>();
        ArrayList<Integer> BigArray = new ArrayList<>();

        int[] array = new int[100];
        Random random = new Random(10);
        int z = 0, y = 0;
        int max = 0, min = 0;

        // Sayıları Atadık
        for (int j = 0; j < array.length; j++) {
            array[j] = random.nextInt(10);
        }
        // Sayıları Yazdırdık
        for (int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
        System.out.print("Enter The Number:");
        int number = scan.nextInt();

        // Numaradan küçük sayıarı bulduk
        for (int i = 0; i < array.length; i++) {
            if (array[i] < number) {
                SmallArray.add(array[i]);
                z++;
            } else {
                BigArray.add(array[i]);
                y++;
            }

        }
        int[] bigArray = new int[y];
        int[] smallArray = new int[z];
        // for (int a : smallArray) {
        // System.out.println(a);
        // }
        for (int b = 0; b < z; b++) {
            smallArray[b] = SmallArray.get(b);
        }
        for (int x : smallArray) {
            System.out.println(x);
        }

        for (int d = 0; d < bigArray.length; d++) {
            bigArray[d] = BigArray.get(d);
        }
        for (int l = 1; l < z; l++) {
            if (smallArray[l - 1] < smallArray[l]) {
                max = smallArray[l];
            }
        }
        for (int c = 1; c < y; c++) {
            if (bigArray[c] < bigArray[c - 1]) {
                min = bigArray[c];
            }
        }
        System.out.println("Girilen Sayıdan küçük en büyük sayı:" + min);
        System.out.println("Girilen Sayıdan büyük en küçük sayı:" + max);
        scan.close();

    }
}