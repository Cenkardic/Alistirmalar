import java.util.Scanner;

public class Alistirma26OdevMinMax {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n, max = 0, min=0;
        System.out.println("Lütfen Kaç sayı girileceğini yazınız: ");
        n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i + ".Sayıyı giriniz:");
            int number = input.nextInt();

            if (i == 1) {
                max = number;
                min = number;

            } else {
                if (number > max) {
                    max = number;
                } else if (number < min) {
                    min = number;


                }
            }

        }
        System.out.println("Minumum değer: "+min);
        System.out.println("Maximum değer: "+max);

    }
}
