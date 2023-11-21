public class summenprogramm {
    public static int summe(int n) {
        if (n <= 1) {
            return 1;
        }
        else {
            return n + summe(n-1);
        }
    }

    public static void main(String[] args) {
        int a = summe(-2020);
        System.out.println(a);
    }
}
