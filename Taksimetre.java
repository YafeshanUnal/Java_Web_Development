
/*  VİRA BİSMİLLAH
*
* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.
* Taksimetre KM başına 2.20 TL tutmaktadır.
! Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
? Taksimetre açılış ücreti 10 TL'dir.

*/
import java.util.*;

public class Taksimetre {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("Kaç Kilometre Yol Aldınız:");
        int km = temp.nextInt();
        int oprice = 10;
        double tmetre = 2.20;
        int mprice = 20;
        double ücret = oprice + tmetre * km;
        boolean flag = ücret > 20;

        System.out.println("FEE:" + (flag == true ? ücret : mprice));

        temp.close();
    }
}
