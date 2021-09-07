
import java.util.*;

public class Calculator {
    public static void main(String[] args) {
        Scanner choise = new Scanner(System.in);
        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:\n1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        int seçim = choise.nextInt();
        System.out.println("İşlem Yapmak İstediğiniz Sayıları Giriniz:");
        int x = choise.nextInt();
        int y = choise.nextInt();

        switch (seçim) {
            case 1:
                System.out.println("Toplam:" + x + y);
                break;
            case 2:
                System.out.println("Çıkarma:" + (x - y));
                break;
            case 3:
                System.out.println("Çarpım:" + x * y);
                break;
            case 4:
                System.out.println("Bölüm:" + x / y);
            default:
                break;
        }

        choise.close();
    }

}
