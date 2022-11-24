import java.util.Scanner;

public class Alistirmalar20Donguler4Kombinasyon {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n,x;
        System.out.print("ilk sayıyı giriniz: ");
        n = input.nextInt();
        System.out.print("İkinci sayıyı girininiz : ");
        x = input.nextInt();
        int total_n= 1,total_x= 1 ;
        for (int i=1;i<=n;i++){
            total_n=total_n*i;

        }
        for (int k=1;k<=x;k++){
            total_x =total_x*k;

        }
        System.out.print("Girilen sayların kombinasyonu: "+total_n/total_x);



    }
}
