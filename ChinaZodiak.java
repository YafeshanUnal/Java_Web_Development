
/* VİRA BİSMİLLLAH 
 * 
 * Java ile kullanıcıdan  doğum tarihini alıp Çin Zodyağı değerini hesaplayan program yazınız.
 Doğum Tarihi %12 = 0 ➜ Maymun


? Doğum Tarihi %12 = 1 ➜ Horoz
? Doğum Tarihi %12 = 2 ➜ Köpek
? Doğum Tarihi %12 = 3 ➜ Domuz
? Doğum Tarihi %12 = 4 ➜ Fare
? Doğum Tarihi %12 = 5 ➜ Öküz
? Doğum Tarihi %12 = 6 ➜ Kaplan
? Doğum Tarihi %12 = 7 ➜ Tavşan
? Doğum Tarihi %12 = 8 ➜ Ejderha
? Doğum Tarihi %12 = 9 ➜ Yılan
? Doğum Tarihi %12 = 10 ➜ At
? Doğum Tarihi %12 = 11 ➜ Koyun
*/
import java.util.*;

public class ChinaZodiak {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.print("Enter Your BirthYear:");
        int year = user.nextInt();

        switch (year % 12) {
            case 1:
                System.out.println("Cockerel");
                break;
            case 2:
                System.out.println("Dog");

                break;
            case 3:
                System.out.println("Pig");

                break;
            case 4:
                System.out.println("Mouse");

                break;
            case 5:
                System.out.println("Bull");

                break;
            case 6:
                System.out.println("Tiger");

                break;
            case 7:
                System.out.println("Rabbit");

                break;
            case 8:
                System.out.println("Dragon");

                break;
            case 9:
                System.out.println("Snake");

                break;
            case 10:
                System.out.println("Horse");

                break;
            case 11:
                System.out.println("Sheep");

                break;
            default:
                break;
        }
        user.close();
    }
}
