public class Employee {

    String Name;
    int salary;
    int workHours;
    int hireYear;
    Employee(String Name, int salary, int workHours, int hireYear) {
        this.Name = Name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }
    void EmployeeInfo() {
        System.out.println("Çalışan Adı: " + this.Name + "\nMaaşı : " + this.salary+" Tl" + "\nHaftalık Çalışma Saati: " + this.workHours + "\nİşe Başlangıç Yılı: "
                + this.hireYear + "\nVergi: " + tax()+" Tl" + "\nMesai: " + bonus()+" Tl" + "\nZam : " + raiseSalary()+" Tl" + "\nAlınacak maaş: " + totalSalary()+" Tl");
    }
    double tax() {

        if (this.salary < 1000) {
            System.out.println("Vergi mükellefsiniz.");
            return 0;
        } else {
            return (this.salary * 3) / 100;
        }
    }
    int bonus() {
        if (workHours > 40) {
            return (this.workHours - 40) * 30;
        }
        return 0;
    }
    int raiseSalary() {
        if (2023 - hireYear < 10) {
            return (this.salary * 5) / 100;

        } else if (10 <= 2023 - hireYear && 2023 - hireYear < 20) {
            return (this.salary * 10) / 100;

        } else if (2023 - hireYear > 19) {
            return (this.salary * 15) / 100;
        }
        return 0;
    }
    double totalSalary() {
        return this.salary + bonus() + raiseSalary() - tax();
    }
}
