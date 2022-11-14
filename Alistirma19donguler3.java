import java.util.Scanner;

public class Alistirma19donguler3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int k;
        System.out.print("Lütfen üstel işlem yapmak istediğiniz sayıyı giriniz: ");
        k = input.nextInt();
        for (int i =1;i<=10000000;i*=k){
            System.out.println(i);

        }

    }
}
