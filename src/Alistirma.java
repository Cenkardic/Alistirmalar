import java.util.Scanner;

public class Alistirma {
    public static void main(String[] args) {
        double miktar,kdv = 0.18,kdvtutari,toplamtutar;
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen miktarı giriniz:");
        miktar = input.nextDouble();
        kdvtutari = miktar*kdv;

        toplamtutar = miktar+kdvtutari;

        System.out.println("toplam tutar: "+toplamtutar);
        System.out.println("miktarınız: "+miktar);
        System.out.println("kdv oranı: "+kdv);
        System.out.println("kdv fiyatı: "+kdvtutari);





    }
}
