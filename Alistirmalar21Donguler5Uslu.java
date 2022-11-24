import java.util.Scanner;

public class Alistirmalar21Donguler5Uslu {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,k;
        System.out.print("Lütfen üssü alınacak sayıyı giriniz: ");
        n= input.nextInt();

        System.out.print("Üs derecesini giriniz: ");
        k= input.nextInt();
        int total=1;

        for (int i=1;i<=k;i++) {
            total= total*n;
            System.out.println(total);
        }

    }
}
