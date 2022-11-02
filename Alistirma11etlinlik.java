import java.util.Scanner;

public class Alistirma11etlinlik {
    public static void main(String[] args) {
        int HavaSicakliği, etkinlikler = 0;

        Scanner input = new Scanner(System.in);

        System.out.print("Hava sıcaklığını giriniz: ");
        HavaSicakliği = input.nextInt();

        if (HavaSicakliği <= 5) {
            System.out.println("Kayak yapabilirsiniz");

        } else if (HavaSicakliği >= 5 && HavaSicakliği <= 25) {
            System.out.println("Sinemaya gidebilirsiniz");
            if (HavaSicakliği >= 15) {
                System.out.println("Piknik yapabilirsiniz");
            }
        }else {
            System.out.println("Yüzmeye gidedebilirsiniz ");
        }


    }


}

