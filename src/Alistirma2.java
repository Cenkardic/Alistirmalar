import java.util.Scanner;
public class Alistirma2 {
    public static void main(String[] args) {

        double a,b,c,ucgenincevresi,u,alan;

        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen 1. kenarı giriniz: ");
        a = input.nextDouble();

        System.out.print("Lütfen 2. kenarı giriniz: ");
        b = input.nextDouble();

        System.out.print("Lütfen 3. kenarı giriniz: ");
        c = input.nextDouble();

        u = (a+b+c)/2;
        ucgenincevresi=2*u;
        System.out.println("Üçgenin çevresi : "+ucgenincevresi);
        alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin alanı: "+alan);



    }
}
