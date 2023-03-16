public class Course {

    Teacher lecturer;
    String Name;
    String Code;
    String prefix;
    int note;
    int quiz;

    Course(String Name, String Code, String prefix, Teacher lecturer) {

        this.prefix = prefix;
        this.Code = Code;
        this.Name = Name;
        this.note = 0;
        this.quiz=0;
        this.lecturer = lecturer;
    }

    void addTeacher(Teacher lecturer){
        if (lecturer.branch.equals(this.prefix)){
            this.lecturer= lecturer;
            System.out.println("Uyuştu");

        }else {
            System.out.println("Bu ders ile akademisyen kodu uyuşmuyor !");
        }
    }
}
