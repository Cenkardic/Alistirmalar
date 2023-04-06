import java.util.Arrays;

public class Alistirma42DizilerTekrarEden {
    static boolean isFind(int[] arr, int value) {
        for (int i : arr) {
            if (i == value) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] list = {1, 5, 8, 12, 15, 8, 12, 5, 13, 15, 13};
        int[] dublicate = new int[list.length];
        int starIndex = 0;
        for (int i = 0; i < list.length; i++) {
            for (int j = 0; j < list.length; j++) {
                if ((i != j) && (list[i] == list[j])) {
                    if (!isFind(dublicate, list[i])) {
                        dublicate[starIndex++] = list[i];
                    }

                    break;
                }
            }
        }
        System.out.println(Arrays.toString(dublicate));
    }
}
