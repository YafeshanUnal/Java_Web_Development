
/*  VİRA BİSMİLLAH
 * 
 * Aşağıdaki işlemleri yapan gelişmiş hesap makinesi
? 1- Toplama İşlemi
? 2- Çıkarma İşlemi
? 3- Çarpma İşlemi
? 4- Bölme işlemi
? 5- Üslü Sayı Hesaplama
? 6- Faktoriyel Hesaplama
? 7- Mod Alma
? 8- Dikdörtgen Alan ve Çevre Hesabı
 * 
 */
import java.util.*;

public class AdvancedCalculator {

    static int sum(int a, int b) {
        return a + b;
    }

    static int subtract(int a, int b) {
        if (a > b)
            return a - b;
        else
            return b - a;
    }

    static int multiply(int a, int b) {
        return a * b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    static void power(int a, int b) {
        int result = 1;
        for (int i = 1; i < b; i++) {
            result *= a;
        }
        System.out.println("Well Behaved Number:" + result);
    }

    static int factor(int a) {
        if (a == 1)
            return a;
        else
            return a * factor(a - 1);
    }

    static int mod(int a, int b) {
        if (a < b)
            return a;
        else
            return a % b;
    }

    static int rectangle(int a, int b) {
        return a * b;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the Choise:\n");
        System.out.println("1-Toplama İşlemi\n" + "2- Çıkarma İşlemi\n" + "3- Çarpma İşlemi\n" + "4- Bölme işlemi\n"
                + "5- Üslü Sayı Hesaplama\n" + "6- Faktoriyel Hesaplama\n" + "7- Mod Alma\n"
                + "8- Dikdörtgen Alan ve Çevre Hesabı");
        int choise = scan.nextInt();
        System.out.print("Enter the Numbers:");
        int x = 0, y = 0;
        if (choise == 6) {
            x = scan.nextInt();
        } else {
            x = scan.nextInt();
            y = scan.nextInt();
        }
        switch (choise) {
            case 1:
                System.out.println("Sum:" + sum(x, y));
                break;
            case 2:
                System.out.println("Substract:" + subtract(x, y));

                break;
            case 3:
                System.out.println("Multiply:" + multiply(x, y));

                break;
            case 4:
                System.out.println("Divide:" + divide(x, y));

                break;
            case 5:
                power(x, y);

                break;
            case 6:
                System.out.println("Factorial:" + factor(x));

                break;
            case 7:
                System.out.println("Mod:" + mod(x, y));

                break;
            case 8:
                System.out.println("Area:" + rectangle(x, y));

                break;
            default:
                break;
        }

        scan.close();
    }
}
