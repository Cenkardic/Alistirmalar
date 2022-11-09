import java.util.Scanner;

public class Alistirma18donguler2 {
    public static void main(String[] args) {
        int k;
        int total=0;
        Scanner input=new Scanner(System.in);



        do {
            System.out.print("Sayı Giriniz : ");
            k = input.nextInt();
            if (k%2==1){
                System.out.println("Lütfen çift sayı giriniz!");

                } else if (k%4==0) {

                total +=k;
                System.out.println("Toplam sayı değeri: "+total);
            }
        }while (k>0);

    }
}
