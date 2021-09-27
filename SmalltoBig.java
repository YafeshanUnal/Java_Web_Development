/*  VİRA BİSMİLAH
 * Java dilinde, arraydeki elemanları küçükten büyüğe sıralayan programı yazınız.
 *  arraynin boyutunu ve arraynin elemanlarını kullanıcıdan alınız.
 */

import java.util.*;

public class SmalltoBig {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Array Size:");
        int size = scan.nextInt();
        int[] array = new int[size];
        int temp;
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter The Number:");
            array[i] = scan.nextInt();
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[i]) {
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }
        }
        for (int x : array) {
            System.out.println("Small to Big:" + x);
        }

        scan.close();
    }
}