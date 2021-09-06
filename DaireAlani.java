
/*  VİRA BİSMİLLAH

* Yarıçapı r, merkez açısısının ölçüsü 𝛼 olan daire diliminin alanı bulan programı yazınız.
? 𝜋 sayısını = 3.14 alınız.
! Formül : (𝜋 * (r*r) * 𝛼) / 360

*/
import java.util.*;

public class DaireAlani {
    public static void main(String[] args) {
        final double PI = 3.14;
        Scanner number = new Scanner(System.in);

        System.out.println("Dairenizin Yarıçapını Giriniz:");
        int r = number.nextInt();
        System.out.println("Dairenizin Merkez Açısını Giriniz:");
        int alfa = number.nextInt();
        double result = ((PI * (r * r) * alfa) / 360);

        System.out.println("Your Result:" + result);
        number.close();
    }

}
