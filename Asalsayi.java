import java.util.Scanner;
public class Asalsayi {
    static int isPrime(int n) {
        int counter = 0;
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                counter++;
            }
        }
        if (counter == 2) {
            System.out.println(n + " Asal sayıdır");
            return counter;
        }
        System.out.println(n + " Asal sayı değildir. !");
        return counter;

    }

    public static void main(String[] args) {
        Scanner mec = new Scanner(System.in);
        int n;
        do {
            System.out.print("Sayı giriniz : ");
            n = mec.nextInt();

            isPrime(n);

        } while (n > 0);

    }
}
