package MusterklausurSo23.A3a;

public class rekursion {
    public static int rek(int n) {
        if (n <= 0) return 0;
        return n + rek(n-1);
    }
}
