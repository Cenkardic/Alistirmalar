public class Teacher {

    String Name;
    String mpno;
    String branch;

    Teacher(String Name, String mpno, String branch) {

        this.Name = Name;
        this.mpno = mpno;
        this.branch = branch;
    }

    void print() {
        System.out.println("Adı : " + this.Name);
        System.out.println("Telefon Numarası: " + this.mpno);
        System.out.println("Bölümü: " + this.branch);

    }
}
