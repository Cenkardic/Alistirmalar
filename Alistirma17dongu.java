import java.util.Scanner;

public class Alistirma17dongu {
    public static void main(String[] args) {
        int k,bolum=0,bolunen=0;
        double sonuc;
        Scanner input=new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        k= input.nextInt();

        for (int i =1;i<=k;i++){
            if ((i%3==0)&&(i%4==0)){
                System.out.println(i);
                bolum++;
                bolunen+=i;
            }
        }
        sonuc=bolunen/bolum;
        System.out.println("Sayıların ortalaması: "+sonuc);
    }
}
