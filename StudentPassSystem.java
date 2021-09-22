
/*  VİRA BİSMİLLAH

* Course sınıfına derse ait sözlü notu kısmını girin
* ve ortalamaya etkisini her ders için ayrı ayrı belirtin.
* Sözlü notlarınıda ortalamaya etkileme yüzdesi ile dahil edin.




*/
import java.util.*;

public class StudentPassSystem {
    String classroom;
    int note;
    int exam;

    StudentPassSystem(String classroom, int note, int exam) {
        classroom = this.classroom;
        note = this.note;
        exam = this.exam;
    }

    void getInfo() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Classroom:");
        this.classroom = scan.nextLine();
        System.out.println("Enter the Note:");
        this.note = scan.nextInt();
        System.out.println("Enter the Exam:");
        this.exam = scan.nextInt();
        scan.close();
    }

}
