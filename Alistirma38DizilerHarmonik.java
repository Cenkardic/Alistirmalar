public class Alistirma38DizilerHarmonik {
    public static void main(String[] args) {
        int[] list = {15, 20, 25, 30, 35, 40};
        double sum = 0.0;
        for (int i = 0; i < list.length; i++) {
            sum += 1.0 / list[i];
        }
        double avarage = list.length / sum;
        System.out.println("dizi harmoniği: "+avarage);


    }
}

