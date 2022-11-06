import java.util.Scanner;

public class Alistirma15CinZodyagi {
    public static void main(String[] args) {

        int dogumyili;

        Scanner input=new Scanner(System.in);

        System.out.print("Doğum yılınızı giriniz: ");
        dogumyili= input.nextInt();

        if (dogumyili%12==0){
            System.out.print("Çin Zodyağı Burcunuz : At");
        } else if (dogumyili%12==1) {
            System.out.print("Çin Zodyağı Burcunuz : Horoz");

        }else if (dogumyili%12==2) {
            System.out.print("Çin Zodyağı Burcunuz : Köpek");

        }else if (dogumyili%12==3) {
            System.out.print("Çin Zodyağı Burcunuz : Domuz");

        }else if (dogumyili%12==4) {
            System.out.print("Çin Zodyağı Burcunuz : Fare");

        }else if (dogumyili%12==5) {
            System.out.print("Çin Zodyağı Burcunuz : Öküz");

        }else if (dogumyili%12==6) {
            System.out.print("Çin Zodyağı Burcunuz : Kaplan");

        }else if (dogumyili%12==7) {
            System.out.print("Çin Zodyağı Burcunuz : Tavşan");

        }else if (dogumyili%12==8) {
            System.out.print("Çin Zodyağı Burcunuz : Ejderha");

        }else if (dogumyili%12==9) {
            System.out.print("Çin Zodyağı Burcunuz : Yılan");

        }else if (dogumyili%12==10) {
            System.out.print("Çin Zodyağı Burcunuz : At");

        }else if (dogumyili%12==11) {
            System.out.print("Çin Zodyağı Burcunuz : Koyun");

        }else {
            System.out.print("Hatalı İşlem Yaptınız!");
        }

    }
}
