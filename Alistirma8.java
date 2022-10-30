import java.util.Scanner;

public class Alistirma8 {
    public static void main(String[] args) {

        double n1, n2;
        int islem;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen 1. sayıyı giriniz: ");
        n1 = input.nextDouble();
        System.out.print("Lütfen 2. sayıyı giriniz: ");
        n2 = input.nextDouble();

        System.out.println("Lütfen işlem seçiniz: ");
        System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
        islem = input.nextInt();

        switch (islem) {
            case 1:
                System.out.println("işleminiz yapıldı: " + (n1 + n2));
                break;
            case 2:
                System.out.println("işleminiz yapıldı : "+ (n1-n2));
                break;
            case 3:
                System.out.println("işleminiz yapıldı : "+ (n1*n2));
                break;
            case 4:
                if (n2!=0)
                    System.out.println("işleminiz yapıldı : "+ (n1/n2));
                else
                    System.out.println("Sayı sıfıra bölünemez!");

                break;
            default:
                System.out.println("Hatalı işlem yapıldı.Lütfen tekrar deneyiniz:");

        }


    }
}
