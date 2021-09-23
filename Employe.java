
public class Employe {
    private String name;
    private int salary;
    private int workHours;
    private int hireYear;
    public int vergi;
    public int bonus;
    public int yıl;
    private int zam;
    public int toplam = 2000;

    Employe(String name, int salary, int hireYear, int workHours) {
        this.name = name;
        this.salary = salary;
        this.hireYear = hireYear;
        this.workHours = workHours;
    }

    public String getName() {
        return name;
    }

    public int getWorkHours() {
        return workHours;
    }

    public int getHireYear() {
        return hireYear;
    }

    public int getSalary() {
        return salary;
    }

    public int getToplam() {
        return toplam;
    }

    public int getZam() {
        return zam;
    }

    public void setToplam(int toplam) {
        this.toplam = toplam;
    }

    public void setZam(int zam) {
        this.zam = zam;
    }

    public void tax() {
        int maaş = getSalary();
        if (maaş < 1000) {
            vergi = 0;
            System.out.println(vergi);
        } else if (1000 < maaş) {
            vergi = salary * 3 / 100;
            this.toplam -= vergi;
            System.out.println(vergi);
        }
    }

    public void bonus() {
        if (40 < workHours) {
            bonus = (workHours - 40) * 30;
            System.out.println(bonus);
            this.toplam += bonus;
        }
    }

    public void raiseSalary() {
        yıl = (2021 - hireYear);
        if (yıl < 10) {
            this.zam = salary * 5 / 100;
            System.out.println("Maaş Artışı:" + zam);
            System.out.println("Toplam Maaş:" + (salary += this.zam));
        } else if (9 < yıl && yıl < 20) {
            this.zam = salary * 1 / 10;
            System.out.println("Maaş Artışı:" + zam);
            System.out.println("Toplam Maaşı:" + (salary += zam));
        } else if (19 < yıl) {
            this.zam = salary * 15 / 100;
            System.out.println("Maaş Artışı:" + zam);
            System.out.println("Toplam Maaş:" + (salary += zam));

        }
    }

    public void showInfos() {
        System.out.println("Adı:" + getName());
        System.out.println("Maaşı:" + getSalary());
        System.out.println("Başlangıç Yılı:" + getHireYear());
        System.out.println("Çalışma Saati:" + getWorkHours());
        System.out.print("Vergi:");
        tax();
        System.out.print("Bonus:");
        bonus();
        raiseSalary();

        System.out.println("Vergi ve Bonuslar ile Birlikte Maaş:" + this.toplam);
    }
}
