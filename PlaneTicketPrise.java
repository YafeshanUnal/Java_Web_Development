
/* VİRA BİSMİLLAH

 * Java ile mesafeye ve şartlara göre uçak bileti fiyatı hesaplayan programı yapın.
 * Kullanıcıdan Mesafe (KM), yaşı ve yolculuk tipi (Tek Yön, Gidiş-Dönüş) bilgilerini alın.
 * Mesafe başına ücret 0,10 TL / km olarak alın. İlk olarak uçuşun toplam fiyatını hesaplayın
 * ve sonrasında ki koşullara göre müşteriye aşağıdaki indirimleri uygulayın ;
 * 
 ! Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, yolculuk tipi ise 1 veya 2) olmalıdır.
 ! Aksi takdirde kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.


? Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
? Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
? Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
? Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 indirim uygulanır.

 */
import java.util.*;

public class PlaneTicketPrise {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        System.out.println("How many kilometers will u go");
        int km = user.nextInt();
        System.out.println("How old are u");
        int age = user.nextInt();
        System.out.println("Coise the Trip Type:\n 1-One Direction\n 2-Round Trip");
        int trip_type = user.nextInt();
        float kmprise = 0.10f;
        float normal = km * kmprise;
        float discount = normal;
        float lastprice = normal;

        if (age < 12) {
            discount = normal - (normal * 1 / 2);
        }

        if (12 <= age && age <= 24) {
            discount = normal - (normal * 1 / 10);

        }

        if (65 <= age) {
            discount = normal - (normal * 3 / 10);
        }

        if (trip_type == 2) {
            lastprice = (discount - (discount * 2 / 10)) * 2;
        }

        System.out.println("Your Total Ticket Fee:" + lastprice + "\n\tPegasus Wishes to a Good Fly");
        user.close();
    }
}