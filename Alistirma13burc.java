import java.util.Scanner;

public class Alistirma13burc {
    public static void main(String[] args) {

        String month;
        int day;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen doğduğunuz ayı giriniz: ");
        month = input.nextLine();

        System.out.print("Lütfen doğduğunuz günü giriniz: ");
        day = input.nextInt();
        if ((day <= 0) || (day > 31)) {
            System.out.print("Lütfen Geçerli Bir Gün Giriniz!");

        } else {
            if (month.equals("Ocak")) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.print("Oğlak Burcusunuz");
                } else {
                    System.out.print("Kova Burcusunuz");
                }

            } else if (month.equals("Şubat")) {
                if ((day >= 1) && (day <= 19)) {
                    System.out.print("Kova Burcusunuz");
                } else if (day>28) {
                    System.out.println("Şubat Ayı 28 Gündür!");
                } else {
                    System.out.print("Balık Burcusunuz");
                }

            } else if (month.equals("Mart")) {
                if ((day >= 1) && (day <= 20)) {
                    System.out.print("Balık Burcusunuz");
                } else {
                    System.out.print("Koç Burcusunuz");
                }

            } else if (month.equals("Nisan")) {
                if ((day >= 1) && (day <= 20)) {
                    System.out.print("Koç Burcusunuz");
                } else if (day>30) {
                    System.out.print("Nisan Ayı 30 Gündür!");
                } else {
                    System.out.print("Boğa Burcusunuz");
                }

            } else if (month.equals("Mayıs")) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.print("Boğa Burcusunuz");
                } else {
                    System.out.print("İkizler Burcusunuz");
                }

            } else if (month.equals("Haziran")) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.print("İkizler Burcusunuz");
                } else if (day>30) {
                    System.out.print("Haziran Ayı 30 Gündür!");

                } else {
                    System.out.print("Yengeç Burcusunuz");
                }

            } else if (month.equals("Temmuz")) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.print("Yengeç Burcusunuz");
                } else {
                    System.out.print("Aslan Burcusunuz");
                }

            } else if (month.equals("Ağustos")) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.print("Aslan Burcusunuz");
                } else {
                    System.out.print("Başak Burcusunuz");
                }

            } else if (month.equals("Eylül")) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.print("Başak Burcusunuz");
                } else if (day>30) {
                    System.out.println("Eylül Ayı 30 Gündür!");

                } else {
                    System.out.print("Terazi Burcusunuz");
                }

            } else if (month.equals("Ekim")) {
                if ((day >= 1) && (day <= 22)) {
                    System.out.print("Terazi Burcusunuz");
                } else {
                    System.out.print("Akrep Burcusunuz");
                }

            } else if (month.equals("Kasım")) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.print("Akrep Burcusunuz");
                } else if (day>30) {
                    System.out.print("Kasım Ayı 30 Gündür!");
                    
                } else{
                    System.out.print("Yay Burcusunuz");
                }

            } else if (month.equals("Aralık")) {
                if ((day >= 1) && (day <= 21)) {
                    System.out.print("Yay Burcusunuz");
                } else {
                    System.out.print("Oğlak Burcusunuz");
                }


            }
        }
    }
}



