import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Alistirma41DizilerOdev {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Lütfen Dizinin eleman sayısını giriniz: ");
        int ArrayNum = input.nextInt();


        int[] Array = new int[ArrayNum];
        for (int i = 0; i < ArrayNum; i++) {
            System.out.print("Lütfen " + (i+1) + ". Elamanı giriniz: ");
            Array[i]=input.nextInt();

        }
        Arrays.sort(Array);
        System.out.println(Arrays.toString(Array));


    }
}
