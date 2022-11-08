import java.util.Scanner;

public class Alistirma16artikyil {
    public static void main(String[] args) {
        int yil;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Yıl Giriniz:");
        yil = input.nextInt();

        if ((yil % 100 == 0)) {
            if (yil % 400 == 0) {
                System.out.print(yil + " bir artık yıldır");
            }else {
                System.out.print(yil + " bir artık yıl değildir");
            }
        } else if (yil % 4 == 0) {
            System.out.print(yil + " bir artık yıldır");
        }else {
            System.out.print(yil + " bir artık yıl değildir");
        }

    }
}
