
/* VİRA BİSMİLLAH
? Java koşullu ifadeler ile kullanıcının burcunu bulan program yapımı.

* Koç Burcu : 21 Mart - 20 Nisan
* Boğa Burcu : 21 Nisan - 21 Mayıs
* İkizler Burcu : 22 Mayıs - 22 Haziran
* Yengeç Burcu : 23 Haziran - 22 Temmuz
* Aslan Burcu : 23 Temmuz - 22 Ağustos
* Başak Burcu : 23 Ağustos - 22 Eylül
* Terazi Burcu : 23 Eylül - 22 Ekim
* Akrep Burcu : 23 Ekim - 21 Kasım
* Yay Burcu : 22 Kasım - 21 Aralık
* Oğlak Burcu : 22 Aralık - 21 Ocak
* Kova Burcu : 22 Ocak - 19 Şubat
* Balık Burcu : 20 Şubat - 20 Mart 

! switch case kullanma
*/
import java.util.*;

public class FindHoroscope {
    public static void main(String[] args) {
        Scanner month = new Scanner(System.in);
        System.out.println("Which Mount and Day are u Birth");
        System.out.print("Month:");
        int ay = month.nextInt();

        boolean flag = ay <= 12;
        if (flag == false) {
            System.out.println("Please Enter Numbers  1 to 12");
            ay = month.nextInt();
        }
        System.out.print("Day:");
        int day = month.nextInt();
        boolean flag1 = 1 <= day && day <= 31;

        if (flag1 == false) {
            System.out.println("Please Enter Numbers  1 to 31");
            day = month.nextInt();
        }

        if (1 == ay) {
            if (1 <= day && day <= 20) {
                System.out.println("Oğlak");

            } else if (21 <= day && day <= 31) {
                System.out.println("Kova");
            }

        }
        if (2 == ay) {
            if (day <= 19) {
                System.out.println("Kova");

            } else if (20 <= day && day <= 31) {
                System.out.println("Balık");
            }

        }
        if (3 == ay) {
            if (day <= 20) {
                System.out.println("Balık");

            } else if (21 <= day && day <= 31) {
                System.out.println("Koç");
            }

        }
        if (4 == ay) {
            if (day <= 20) {
                System.out.println("Koç");

            } else if (21 <= day && day <= 31) {
                System.out.println("Boğa");
            }

        }
        if (5 == ay) {
            if (day <= 21) {
                System.out.println("Boğa");

            } else if (22 <= day && day <= 31) {
                System.out.println("İkizler");
            }
        }
        if (6 == ay) {
            if (day <= 22) {
                System.out.println("İkizler");

            } else if (23 <= day && day <= 31) {
                System.out.println("Yengeç");
            }

        }
        if (7 == ay) {
            if (day <= 22) {
                System.out.println("Yengeç");

            } else if (23 <= day && day <= 31) {
                System.out.println("Aslan");
            }

        }
        if (8 == ay) {
            if (day <= 22) {
                System.out.println("Aslan");

            } else if (23 <= day && day <= 31) {
                System.out.println("Başak");
            }

        }
        if (9 == ay) {
            if (day <= 22) {
                System.out.println("Basak");

            } else if (23 <= day && day <= 31) {
                System.out.println("Terazi");
            }
        }
        if (10 == ay) {
            if (day <= 22) {
                System.out.println("Terazi");

            } else if (23 <= day && day <= 31) {
                System.out.println("Akrep");
            }

        }
        if (11 == ay) {
            if (day <= 21) {
                System.out.println("Akrep");

            } else if (22 <= day && day <= 31) {
                System.out.println("Yay");
            }

        }
        if (12 == ay) {
            if (day <= 21) {
                System.out.println("Yay");

            } else if (22 <= day && day <= 31) {
                System.out.println("Oğlak");
            }

        }
        month.close();
    }

}
