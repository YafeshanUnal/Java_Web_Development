
/*  VİRA BİSMİLLAH
 * 
 * Atm projesi
 ! switch-case yapısı kullanılacaktır.
 */
import java.util.*;

public class AtmEnter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter The User Name:");
        String uname = input.nextLine();
        System.out.print("Enter The Password:");
        int password = input.nextInt();
        int balance = 650;
        int action = 0;
        // boolean flag = uname == "Yafeshan" && password == 1869;
        if (uname.equals("Yafeshan") && password == 1869) {
            System.out.println("\n1-Enter Money" + "\n2-Withdraw Money" + "\n3-Money Balance" + "\n4-Exit");
            System.out.print("\tLogin Succesfull Select the Action:");
            action = input.nextInt();
        } else {
            System.out.println("Incorrect Login Please Try Again:");
            System.out.print("Enter The User Name:");
            uname = input.nextLine();
            System.out.print("Enter The Password:");
            password = input.nextInt();

        }
        switch (action) {
            case 1:
                System.out.print("Enter the Value the Deposit:");
                balance += input.nextInt();
                System.out.println("Last Money Balance:" + balance);
                break;
            case 2:
                System.out.println("Enter the Withdraw Money Amount:");
                balance -= input.nextInt();
                System.out.println("Last Money Balance:" + balance);
                break;
            case 3:
                System.out.println("Your Money Balance:" + balance);
                break;
            case 4:
                System.out.println("See You Later...");
                break;

            default:
                System.out.println("Incorrect Entry:(");

        }

        input.close();
    }
}
