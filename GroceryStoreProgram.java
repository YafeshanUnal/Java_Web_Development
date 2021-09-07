
/*
* Java ile kullanıcıların manavdan almış oldukları ürünlerin 
* kilogram değerlerine göre toplam tutarını ekrana yazdıran programı yazın.

! Meyveler ve KG Fiyatları

Armut : 2,14 TL
Elma : 3,67 TL
Domates : 1,11 TL
Muz: 0,95 TL
Patlıcan : 5,00 TL 
*/
import java.util.*;

public class GroceryStoreProgram {
    public static void main(String[] args) {
        Scanner customer = new Scanner(System.in);

        System.out.println("Enter Kilograms of Pears:");
        float pears = customer.nextFloat();

        System.out.println("Enter Kilograms of Apple:");
        float apple = customer.nextFloat();

        System.out.println("Enter Kilograms of Tomato:");
        float tomato = customer.nextFloat();

        System.out.println("Enter Kilograms of Banana:");
        float banana = customer.nextFloat();

        System.out.println("Enter Kilograms of Eggplant:");
        float eggplant = customer.nextFloat();
        double totalfee = (pears * 2.14) + (apple * 3.67) + (tomato * 1.11) + (banana * 0.95) + (eggplant * 5.0);

        System.out.println("Total Fee:" + totalfee);

        customer.close();
    }
}
