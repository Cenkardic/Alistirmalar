import java.util.Scanner;

public class Alistirma5Odev1 {
    public static void main(String[] args) {
        double boy,kilo;
        double vucutkitleindeksi;
        Scanner input=new Scanner(System.in);
        System.out.print("Lütfen boyunuzu giriniz: ");
        boy =input.nextDouble();
        System.out.print("Lütfen kilonuzu giriniz: ");
        kilo= input.nextDouble();
        vucutkitleindeksi = kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+vucutkitleindeksi);


    }
}
