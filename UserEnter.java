
/*
* Eğer şifre yanlış ise kullanıcıya şifresini sıfırlayıp sıfırlamayacağını sorun
* eğer kullanıcı sıfırlamak isterse yeni girdiği şifrenin hatalı girdiği
* ve unuttuğu şifre ile aynı olmaması gerektiğini kontrol edip ,
* şifreler aynı ise ekrana "Şifre oluşturulamadı, lütfen başka şifre giriniz."
* sorun yoksa "Şifre oluşturuldu" yazan programı yazınız.

 */
import java.util.*;

public class UserEnter {

    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);
        final int şifre = 1234;

        System.out.println("Enter Your Password:");
        int password = user.nextInt();
        boolean flag = password == 1234;

        if (flag == false) {
            System.out.println("Şifrenizi Yanlış Girdiniz Sıfırlamak İsterseniz 1'e Yoksa 0'a Basınız:");
            int kontrol = user.nextInt();

            if (kontrol == 1) {
                System.out.println("Yeni Şifrenizi Giriniz:");
                int newpassword = user.nextInt();

                while (newpassword == şifre) {

                    if (newpassword == şifre) {

                        System.out.println("Eski Şİfrenizi Kullanamazsınız Lütfen Başka Bir Şifre Giriniz:");
                        newpassword = user.nextInt();
                    }
                }
                System.out.println("Şifreniz Başarıyla Oluşturuldu");

            } else {
                System.out.println("Have A Nice Day:))");
            }

        } else {
            System.out.println("Congrulations...");
        }

        user.close();
    }
}