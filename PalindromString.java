
/*  VİRA BİSMİLLAH
 * Java dilinde kullanıcının girdiği kelimenin "Palindromik" olup olmadığı bulan bir program yazıyoruz.
 ? Eğer bir kelimenin tersten okunuşu yine aynı kelimeyi veriyorsa o kelime "Palindromik Kelime'dir".

 */
import java.util.*;

public class PalindromString {
    static boolean Palindrome(String str) {
        int i = 0, j = str.length() - 1;
        while (i < j) {
            if (str.charAt(i) != str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("enter the string:");
        String str = scan.next();
        System.out.println(Palindrome(str) ? "Palindrom" : "NOt Palindrom");
        scan.close();
    }
}
