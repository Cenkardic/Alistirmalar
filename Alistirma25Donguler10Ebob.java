import java.util.Scanner;

public class Alistirma25Donguler10Ebob {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int n1, n2, ekok = 1;
        System.out.print("Lütfen 1. sayı değerini giriniz: ");
        n1 = input.nextInt();

        System.out.print("Lütfen 2. sayı değerini giriniz: ");
        n2 = input.nextInt();
        int i = 1, ebob = 1, choose, k = 1;

        System.out.println("Lütfen yapmak istediğiniz işlemi tuşlayınız: \n1-Ebob alma:\n2-Ekok alma: ");
        choose = input.nextInt();
        if (choose == 1) {
            if (n1 < n2) {

                while (i <= n1) {
                    if ((n1 % i == 0) && (n2 % i == 0)) {
                        ebob = i;
                    }
                    i++;
                }
                System.out.println(ebob);
            } else {
                while (i <= n2) {
                    if ((n1 % i == 0) && (n2 % i == 0)) {
                        ebob = i;
                    }
                    i++;

                }
                System.out.println(ebob);
            }


        } else if (choose == 2) {
            while (k <= n1 * n2) {
                if ((k % n1 == 0) && (k % n2 == 0)) {
                    ekok = k;
                    break;

                }
                k++;
            }
            System.out.println(ekok);


        }
    }
}




