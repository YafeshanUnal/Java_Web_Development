
/*  VİRA BİSMİLLAH
 * 
 * Bir sayı dizisindeki 
 ! tekrar eden 
 * çift sayıları berlirten program yazarak bizimle paylaşmalısın.

 */

public class RepeatArrayNumber {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4, 6, 6, 2, 8, 8, 9, 11 };
        // Random random = new Random();
        // for (int i = 0; i < 100; i++) {
        // array[i] = random.nextInt(100);
        // }
        for (int i : array) {
            System.out.println("All Numbers:" + i);
        }

        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                System.out.println("Repeat Even Numbers:" + array[j]);
            }
        }

    }

}
