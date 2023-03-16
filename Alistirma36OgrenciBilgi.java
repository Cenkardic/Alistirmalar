public class Alistirma36OgrenciBilgi {
    public static void main(String[] args) {
        Teacher f1 = new Teacher("Elif", "55553422", "FIZ");
        Teacher f2 = new Teacher("Asım", "1652168121", "KIM");
        Teacher f3 = new Teacher("Hasan", "621651545612", "BIO");

        Course Fizik = new Course("Fizik", "101", "FIZ", f1);
        Course Kimya = new Course("Kimya ", "101", "KIM", f2);
        Course Biyoloji = new Course("Biyoloji", "101", "BIO", f3);

        Student a1 = new Student("Cenk", "23", "4", Fizik, Kimya, Biyoloji);

        a1.addExamNote(50, 60, 100);
        a1.quizNotes(50,20,30);

        a1.printNote();
         /*f3.print();
        Fizik.addTeacher(f1);
        Kimya.addTeacher(f2);
        Biyoloji.addTeacher(f3);
        */
    }

}

