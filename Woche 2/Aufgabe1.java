public class Aufgabe1 {
    public static float berechne(float q, int n, float a) {
        for (int i = 1; i < n; i++) {
            a = a*q;
        }
        return a;
    }

    public static float berechne2(float q, int n,float a) {
        int i = 1;
        while (i<n) { // i < n, da wir a1 wissen, und somit nur i = 2 bis i = n auswerten, und das rechnen wir -1 um eine einfachere condition haben
            a = a*q;
            i++;
        }
        return a;
    }

    public static float berechne3(float q, int n, float a) {
        if (n<=1) {
            return a;
        }
        return berechne3(q, n-1, a)*q;
    }

    public static void main(String[] args) {
        ///reader
        System.out.println(berechne(2, 6, 1));
        System.out.println(berechne2(2, 6, 1));
        System.out.println(berechne3(2, 6, 1));
        berechne(0, 0, 0);
    }
}
