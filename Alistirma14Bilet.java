import java.util.Scanner;

public class Alistirma14Bilet {
    public static void main(String[] args) {

        double km, OdenecekUcret, kmbasiucret;
        int tip, yas;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen kaç km gideceğinizi yazınız: ");
        km = input.nextDouble();

        kmbasiucret = km * 0.10;

        System.out.print("Lütfen sadece gidiş için 1'i, Gidiş-Dönüş için 2'yi seçin: ");
        tip = input.nextInt();

        System.out.print("Lütfen Yaşınızı giriniz:");
        yas = input.nextInt();

        if (tip == 1) {

            if ((yas >= 0) && (yas < 12)) {
                OdenecekUcret = kmbasiucret * 0.5;
                System.out.print("Ödeyeceğiniz Tutar: " + OdenecekUcret + "TL");
            } else if ((yas >= 12) && (yas <= 24)) {
                OdenecekUcret = kmbasiucret * 0.9;
                System.out.print("Ödeyeceğiniz Tutar: " + OdenecekUcret + "TL");

            } else if (yas >= 65) {
                OdenecekUcret = kmbasiucret * 0.7;
                System.out.print("Ödeyeceğiniz Tutar: " + OdenecekUcret + "TL");
            }else {
                System.out.print("Hatalı İşlem Yapıldı! Lütfen Tekrar Deneyiniz.");
            }

        } else if (tip == 2) {

            if ((yas >= 0) && (yas < 12)) {
                OdenecekUcret = (2 * kmbasiucret) * 0.5 * 0.8;
                System.out.print("Ödeyeceğiniz Tutar: " + OdenecekUcret + "TL");

            } else if ((yas >= 12) && (yas <= 24)) {
                OdenecekUcret = (2 * kmbasiucret) * 0.9 * 0.8;
                System.out.print("Ödeyeceğiniz Tutar: " + OdenecekUcret + "TL");

            } else if (yas >= 65) {
                OdenecekUcret = (2 * kmbasiucret) * 0.7 * 0.8;
                System.out.print("Ödeyeceğiniz Tutar: " + OdenecekUcret + "TL");
            }else {
                System.out.print("Hatalı İşlem Yapıldı! Lütfen Tekrar Deneyiniz.");
            }

        } else {
            System.out.print("Hatalı işlem yapıldı! Lütfen tekrar deneyiniz.");
        }

    }
}

    
