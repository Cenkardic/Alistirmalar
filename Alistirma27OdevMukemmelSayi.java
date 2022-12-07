import java.util.Scanner;

public class Alistirma27OdevMukemmelSayi {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int value = 0;

        System.out.print("Please Enter a Number: ");
        int number = input.nextInt();

        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                value += i;
            }
        }
        if (value == number) {
            System.out.println(number + " is perfect number.");
        } else {
            System.out.println(number + " is not perfect number.");
        }

    }
}
