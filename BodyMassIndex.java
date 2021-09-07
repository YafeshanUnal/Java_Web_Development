
/*
 * VücutKitleIndeksi
 
? Java ile kullanıcıdan boy ve kilo değerlerini alıp bir değişkene atayın.
? Aşağıda ki formüle göre kullanıcının "Vücut Kitle İndeks" değerini hesaplayıp ekrana yazdırın.
! Kilo (kg) / Boy(m) * Boy(m)


*/
import java.util.*;

public class BodyMassIndex {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("Enter Your Weight:");
        double kg = user.nextDouble();
        System.out.println("Enter Your Heihgt:");
        double m = user.nextDouble();

        double vki = (kg / (m * m));

        System.out.println("Result:" + vki);

        user.close();
    }

}