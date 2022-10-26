import java.util.Scanner;
public class Alistirma4 {
    public static void main(String[] args) {
        double pi=3.14,r;
        Scanner input= new Scanner(System.in);
        System.out.print("Lütfen yarı çap değerini giriniz: ");
        r = input.nextDouble();
        double alan=r*r*pi;
        double cevre = 2*pi*r;
        System.out.println(alan);
        System.out.println(cevre);

    }
}
