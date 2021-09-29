
/*  VİRA BİSMİLLAH
 * Java dilinde programın 0-100 arasında rastgele seçtiği bir sayıyı 
 * kullanıcının tahmin etmesini istediğimiz bir "Sayı Tahmin Oyunu" yapıyoruz.

 */
import java.util.*;

public class NumberProduction {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int trueNumber = random.nextInt(100);
        boolean flag = 1 > 0;
        System.out.println("Welcome You Have 5 rights in the Game!!!");
        System.out.println("Enter the Production Number:");
        int productionNumber = scan.nextInt();
        for (int i = 0; i < 5; i++) {
            if (productionNumber < trueNumber) {
                System.out.println("Enter the more big number:");
                productionNumber = scan.nextInt();
            } else if (productionNumber > trueNumber) {
                System.out.println("Enter the more small number:");
                productionNumber = scan.nextInt();
            } else {
                flag = true;
            }
        }
        if (flag == true)
            System.out.println("Good Job Babe :)");
        System.out.println("Computer have Number:" + trueNumber);
        scan.close();
    }
}
