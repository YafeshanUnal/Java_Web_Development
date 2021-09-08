
/*  VİRA BİSMİLLAH 
 
 * Java ile kullanıcının girdiği değerler ile üslü sayı hesaplayan programı 
 ! "For Döngüsü" kullanarak yapınız. 
*/
import java.util.*;

public class ExponentialNumber {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number to Exponentiated:");
        int sayi = scan.nextInt();
        System.out.print("Enter  the power of Number");
        int üs = scan.nextInt();
        int result = 1;
        for (int i = 1; i <= üs; i++) {
            result *= sayi;
        }
        System.out.print(sayi + " ^ " + üs + " Result:" + result);
        scan.close();
    }
}
