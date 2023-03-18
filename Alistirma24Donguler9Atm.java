import java.util.Scanner;

public class Alistirma24Donguler9Atm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int right = 3,deposit,withdraw,balance=2000;
        String Username, Password;

        while (right > 0) {
            System.out.println("X Bankasına Hoşgeldiniz.");
            System.out.print("Lütfen Kullanıcı Adınızı Giriniz: ");
            Username = input.nextLine();
            System.out.print("Lütfen Şifrenizi Giriniz: ");
            Password = input.nextLine();
            if (Username.equals("cenk") && (Password.equals("123"))) {
                System.out.println("Hoşgeldiniz Lütfen Yapmak İstediğiniz İşlemi Tuşlayınız: \n1-Para Yatırma\n2-Bakiye Görme\n3-Para çekme ");
                int choose= input.nextInt();
                if (choose == 1) {
                    System.out.println("Lütfen Yatırmak İstediğini Miktarı Giriniz: ");
                    deposit = input.nextInt();
                    balance+=deposit;
                    System.out.print("Bakiyeniz "+balance+"Tldir.");
                } else if (choose==2) {
                    System.out.println("Bakiyeniz "+balance+"Tldir.");

                } else if (choose==3) {
                    System.out.print("Çekmek İstediğiniz Miktarı Tuşlayınız: ");
                    withdraw= input.nextInt();
                    if (withdraw>balance){
                        System.out.println("Bakiyenizden Fazla Para Çekme İşlemi Yapamazsınız.");
                    }else {
                        balance-=withdraw;
                        System.out.println("Bakiyeniz "+balance+"TLdir.");
                    }
                }
                break;

            } else {
                System.out.println("Hatalı Giriş Yaptınız! Lütfen Tekrar deneyiniz.");
                right -= 1;
                if (right == 0) {
                    System.out.println("3 Hatalı Giriş Yapıldı. Lütfen Bankanızla İletişime Geçiniz.");
                }
            }
        }

    }
}
