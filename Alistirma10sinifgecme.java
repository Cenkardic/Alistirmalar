import java.util.Scanner;

public class Alistirma10sinifgecme {
    public static void main(String[] args) {

        int mat, fizik, turkce, kimya, biyoloji;
        double ortalama;
        int derssayisi=0,dersler=0;

        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen matematik notunuzu giriniz: ");
        mat = input.nextInt();
        if (mat<0||mat>100){
            System.out.println("Lütfen 100 ile 0 arasında bir sayı giriniz.");
        }else {
            derssayisi +=1;
            dersler +=mat;
        }

        System.out.print("Lütfen fizik notunuz giriniz: ");
        fizik = input.nextInt();
        if (fizik<0||fizik>100){
            System.out.println("Lütfen 100 ile 0 arasında bir değer giriniz.");
        }else {
            derssayisi +=1;
            dersler += fizik;
        }

        System.out.print("Lütfen türkçe notunuzu giriniz: ");
        turkce = input.nextInt();
        if (turkce<0||turkce>100){
            System.out.println("Lütfen 100 ile 0 arasında bir değer giriniz.");
        }else {
            derssayisi +=1;
            dersler+= turkce;
        }

        System.out.print("Lütfen kimya notunuzu giriniz: ");
        kimya = input.nextInt();
        if (kimya<0||kimya>100){
            System.out.println("Lütfen 100 ile 0 arasında bir değer giriniz.");
        }else {
            derssayisi +=1;
            dersler +=kimya;
        }

        System.out.print("Lütfen biyoloji notunuzu giriniz: ");
        biyoloji = input.nextInt();
        if (biyoloji<0||biyoloji>100){
            System.out.println("Lütfen 100 ile 0 arasında bir değer giriniz.");

        }else {
            derssayisi +=1;
            dersler +=biyoloji;
        }

        ortalama = (dersler) /derssayisi;
        System.out.print("ortalamanız: "+ortalama);
        if (ortalama<55){
            System.out.print("sınıfı geçemediniz ");
        }else {
            System.out.print("sınıfı geçtiniz tebrikler! ");
        }

    }
}


