public class LsgAufgabe1 { //SS2021
    public static void main(String[] args) {
        int n = 10;
        float q = 2;
        float a1 = 1;
        System.out.println(berechne(n,q,a1));
        System.out.println(berechne2(n,q,a1));
        System.out.println(berechne3(n,q,a1));
    }

    static public float berechne(int n, float q, float a1) {
        float a = a1;
        for (int i = 1; i < n; i++) {
            a = a * q;
        }
        return a;
    }

    static public float berechne2(int n, float q,float a1) {
        if (n <= 1) return a1;
        return q * berechne2(n-1, q,a1);
    }

    static public float berechne3(int n, float q,float a1) {
        int i = 1;
        float a = a1;
        while (i<n) {
            i++;
            a = a*q;
        }
        return a;
    }
}
