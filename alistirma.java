package test3;

import java.util.Scanner;
import java.util.Arrays;

public class alistirma {
    public static void main(String[] args) {
        int[] list = {5, 10, 15, 17, 20, 55, 85, 92};
        Scanner input = new Scanner(System.in);
        Arrays.sort(list);
        System.out.println(Arrays.toString(list));
        System.out.println("Lütfen sayı giriniz: ");
        int a = input.nextInt();
        for (int i = 0; i < list.length; i++) {
            if (a > list[i] && a <= list[i + 1]) {
                System.out.println("Girilen sayıya en yakın küçük sayı: " + list[i]);
                System.out.println("Girilen sayıya en yakın büyük sayı: " + list[i + 1]);
            }


        }


    }
}
