import java.util.Scanner;

public class Alistirma28OdevTersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int linecount;

        System.out.print("Please enter your count of line: ");
        linecount = input.nextInt();

        for (int i = linecount; i > 0; i--) {

            for (int k=0;k<linecount-i;k++) {
                System.out.print(" ");
            }
            for (int m=(2*i)-1;m>0;m-- ){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
