
/*
* Java koşullu ifadeler ile hava sıcaklığına göre etkinlik öneren program yapımı.

? Sıcaklık 5'dan küçük ise "Kayak" yapmayı öner.


? Sıcaklık 5 ve 15 arasında ise "Sinema" etkinliğini öner.


? Sıcaklık 15 ve 25 arasında ise "Piknik" etkinliğini öner.


? Sıcaklık 25'ten büyük ise "Yüzme" etkinliğini öner.

*/
import java.util.*;

public class WeatherForecast {
    public static void main(String[] args) {
        Scanner temp = new Scanner(System.in);
        System.out.println("What is the Temperature:");
        int derece = temp.nextInt();

        if (derece < 5) {
            System.out.println("Do Ski");
        } else if (5 < derece && derece < 15) {
            System.out.println("Go to the Movie");
        } else if (15 < derece && derece < 25) {
            System.out.println("Go to the Outdoors");
        } else if (derece > 25) {
            System.out.println("Go to swim the Ocean");
        } else if (derece > 35) {
            System.out.println("Stay at Home");
        }
        temp.close();
    }
}
