import java.util.Scanner;

public class Alistirma31Hesapmakinesi {


    static int square(int a,int b){
        int result = a*b;
        System.out.println("alanı : "+result);
        return result;
    }
    static int mod(int a, int b) {
        int result = a % b;
        System.out.println("mod değeri : " + result);
        return result;
    }

    static int power(int a, int b) {
        int result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
            System.out.println("işlem sonucu: " + result);
        }
        return result;
    }

    static int divided(int a, int b) {
        int result = a / b;
        System.out.println("Bölme işleni sonucu: " + result);
        return result;
    }

    static int times(int a, int b) {
        int result = a * b;
        System.out.println("Çarpma işlemi sonucu: " + result);
        return result;
    }

    static int sum(int a, int b) {
        int result = a + b;
        System.out.println("toplam değer: " + result);
        return result;
    }

    static int minus(int a, int b) {
        int result = a - b;
        System.out.println("Çıkarma işlemi sonucu : " + result);
        return result;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int secim;
        String menu = " 1-Toplama işlemi\n 2-Çıkarma işlemi\n 3-Çarpma işlemi\n 4-Bölme işlemi\n 5-Üslü Hesaplama\n" +
                " 6-Mod alma\n 7-Alan hesabı\n 0-Çıkış yap";

        System.out.println(menu);
        System.out.println("Lütfen işlem seçiniz");
        secim = input.nextInt();

        while (secim != 0) {
            System.out.println("Lütfen a değerini giriniz: ");
            int a = input.nextInt();
            System.out.println("Lütfen b değerini giriniz: ");
            int b = input.nextInt();

            if (secim == 1) {
                sum(a, b);

            } else if (secim == 2) {
                minus(a, b);
            } else if (secim == 3) {
                times(a, b);

            } else if (secim == 4) {
                divided(a, b);

            } else if (secim == 5) {
                power(a, b);

            } else if (secim == 6) {
                mod(a, b);
            } else if (secim==7) {
                square(a,b);

            } else {
                System.out.println("Lütfen geçerli bir işlem tanımlayınız.");
            }

        }
    }


}

