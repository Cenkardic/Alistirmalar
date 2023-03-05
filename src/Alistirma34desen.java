

public class Alistirma34desen {
    static int desen(int x) {
        if (x > 0) {
            System.out.println(x);
            return x - desen(x - 5);

        }
        if (x <= 0) return 20;{

        System.out.println(x);
        return x + desen(x + 5);
        }

    }

    public static void main(String[] args) {
        desen(20);

    }
}
