import java.util.Scanner;
public class Alistirma6Odev2 {
    public static void main(String[] args) {
        double armut,elma,domates,muz,patlican,toplam;

        Scanner input= new Scanner(System.in);

        System.out.print("Lütfen Kaç Kg Armut aldığınızı giriniz : ");
        armut = input.nextDouble();

        System.out.print("Lütfen Kaç Kg Elma aldığınızı giriniz : ");
        elma = input.nextDouble();

        System.out.print("Lütfen Kaç Kg Domates aldığınızı giriniz : ");
        domates = input.nextDouble();

        System.out.print("Lütfen Kaç Kg Muz aldığınızı giriniz : ");
        muz = input.nextDouble();

        System.out.print("Lütfen Kaç Kg Patlıcan aldığınızı giriniz : ");
        patlican= input.nextDouble();
        toplam= (armut*2.14)+(elma*3.67)+(domates*1.11)+(muz*0.95)+(patlican*5.00);
        System.out.println("Toplam ödenecek tutar : "+toplam);


    }
}
