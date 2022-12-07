import java.util.Scanner;

public class Alistirma22Donguler7Harmonik {
    public static void main(String[] args) {
        Scanner main=new Scanner(System.in);

        System.out.println("Sayıyı giriniz: ");
        int n= main.nextInt();
        double sonuc=0;

        for (double i=1;i<=n;i++){

            sonuc+=(1/i);
            System.out.println(sonuc);
        }


    }
}
