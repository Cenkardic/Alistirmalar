import java.util.Scanner;

public class Alistirma32usyapan {

    static int power(int x, int y) {

        int result = 1;
        for (int i = 1; i <= y; i++) {
            result *= x;
        }
        if (x == 0) {
            int sonuc = x;
            System.out.print("işlem sonucu: " + sonuc);
            return sonuc;

        } else if (x == 0 && y == 0) {
            String Hata;
            System.out.println("Hatalı işlem yapıldı.");
        } else if (y == 0) {
            int sonuc = 1;
            System.out.print("İşlem sonucu: " + sonuc);
            return sonuc;

        }

        System.out.println(result);

        return result;


    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen taban değeri giriniz: ");
        int x = input.nextInt();
        System.out.println("Lütfen üs derecesini giriniz: ");
        int y = input.nextInt();
        power(x, y);


    }
}
