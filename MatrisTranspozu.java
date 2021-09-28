/*  VİRA BİSMİLLAH
 * Java dilinde, çok boyutlu diziler ile oluşturulmuş matrisin transpozunu bulan programı yazınız.

 */
public class MatrisTranspozu {
    public static void main(String[] args) {
        int array[][] = new int[][] { { 5, 6, 3 }, { 2, 3, 5 }, { 8, 4, 6 }, { 8, 16, 4 } };

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("\n");
        for (int k = 0; k < 3; k++) {
            for (int l = 0; l < 4; l++) {
                System.out.print(array[l][k] + "\t");
            }
            System.out.println();
        }

    }
}
