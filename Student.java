public class Student {
    String Name;
    String stuNo;
    String classes;
    double avarage;
    Course c1;
    Course c2;
    Course c3;


    Student(String Name, String stuNo, String classes, Course c1, Course c2, Course c3) {

        this.Name = Name;
        this.stuNo = stuNo;
        this.classes = classes;
        this.avarage = 0;
        this.c1 = c1;
        this.c2 = c2;
        this.c3 = c3;

    }

    void addExamNote(int note1, int note2, int note3) {
        if (note1 >= 0 && note1 <= 100) {
            c1.note = note1;
        }
        if (note2 >= 0 && note2 <= 100) {
            c2.note = note2;
        }
        if (note3 >= 0 && note3 <= 100) {
            c3.note = note3;
        }

    }

    void quizNotes(int quiz1, int quiz2, int quiz3) {
        if (quiz1 >= 0 && quiz1 <= 100) {
            c1.quiz = quiz1;
        }
        if (quiz2 >= 0 && quiz2 <= 100) {
            c2.quiz = quiz2;

        }
        if (quiz3 >= 0 && quiz3 <= 100) {
            c3.quiz = quiz3;

        }
    }


    void avarage() {
        this.avarage = ((((this.c1.note * 80) / 100) + ((this.c1.quiz * 20) / 100)) + (((this.c2.note * 80) / 100) +
                ((this.c2.quiz * 20) / 100)) + (((this.c3.note * 80) / 100) + ((this.c3.quiz * 20) / 100))) / 3;

        if (this.avarage > 50) {
            System.out.println("Geçtiniz");
        } else {
            System.out.println("Kaldınız.");
        }

    }

    void printNote() {
        System.out.println(c1.Name + " Dersinin Notu\t    : " + c1.note + "        Quiz Notu: " + c1.quiz);
        System.out.println(c2.Name + " Dersinin Notu\t: " + c2.note + "        Quiz Notu: " + c2.quiz);
        System.out.println(c3.Name + " Dersinin  Notu\t: " + c3.note + "       Quiz Notu: " + c2.quiz);
        System.out.println("Ortalama : " + this.avarage);

    }
}
