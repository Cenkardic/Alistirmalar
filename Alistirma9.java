import java.util.Scanner;

public class Alistirma9 {
    public static void main(String[] args) {

        String UsarName, Password, NewPassword, yes;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Kullancı Adınızı Giriniz: ");
        UsarName = input.nextLine();

        System.out.print("Lütfen Şifrenizi Giriniz: ");
        Password = input.nextLine();
        if (UsarName.equals("Cenk") && (Password.equals("cenk123"))) {
            System.out.println("Hoşgeldiniz :) ");
        } else if (!Password.equals("cenk123")) {
            System.out.println("Şifre Hatalı,Yeni bir şifre belirlemek istermisiniz ?\nEvet\nHayır");
            yes = input.nextLine();
            if (!yes.equals("Evet"))
                System.out.println("iyi günler dileriz.");
            else if (yes.equals("Evet")) {
                System.out.println("Lütfen yeni şifre giriniz:");
                NewPassword = input.nextLine();
                if (NewPassword.equals("cenk123")) {
                    System.out.println("Yeni şifreniz eski şifrenizle aynı olamaz! ");
                } else{
                    System.out.println("Şifreniz Başarıyla değiştirildi");
                }

            }

        }

    }
}
