
/*  VİRA BİSMİLLAH
 * 
 * Dizideki sayıların harmonik ortalamasını hesaplayan programı yazınız.
 ? Harmonik Ortalama formülü : n (eleman sayısı) / elemanların harmonik serisi
 * 
 */
import java.util.*;

public class HarmonikArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Kaç Boyutlu bir dizi istiyorsunuz:");
        int size = scan.nextInt();
        double harmonik = 0;
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Sayıları Giriniz:");
            array[i] = scan.nextInt();
            harmonik += 1.0 / array[i];
        }
        System.out.println("Harmonik Average Result:" + size / harmonik);
        scan.close();

    }
}
