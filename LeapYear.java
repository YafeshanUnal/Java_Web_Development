
/** VİRA BİSMİLLAH

 * Java ile kullanıcının girdiği yılın artık olup olmadığını bulan programı yazınız.
 */
import java.util.*;

public class LeapYear {
    public static void main(String[] args) {
        Scanner year = new Scanner(System.in);
        System.out.print("Enter Your Year:");
        int sene = year.nextInt();
        if (sene % 4 == 0) {
            System.out.println(sene + "is a Leap Year");
        } else {
            System.out.println(sene + "is!nt Leap Year");
        }
        year.close();
    }
}
