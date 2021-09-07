/*  VİRA BİSMİLLAH

* Girilen 3 sayıyı "küçükten büyüğe" sıralayan programı yazınız.
*/

import java.util.*;

public class NumberSort {
    public static void main(String[] args) {
        Scanner number = new Scanner(System.in);
        // ArrayList<Integer> array = new ArrayList();
        int a = number.nextInt();
        int b = number.nextInt();
        int c = number.nextInt();
        int[] dizi = { a, b, c };
        // for (int i = 0; i < 3; i++) {
        // System.out.println(i + ".Enter Numbers to Sort:");
        // dizi[i] = number.nextInt();
        // }

        for (int j = 0; j < 3; j++) {
            for (int k = 0; k < 3; k++) {
                if (dizi[j] > dizi[k]) {
                    int temp = dizi[j];
                    dizi[j] = dizi[k];
                    dizi[k] = temp;

                }
            }

        }
        for (int m = 0; m < 3; m++) {
            System.out.println("\tSort List from Largest to Smallest:" + dizi[m]);
        }
        number.close();
    }

}
