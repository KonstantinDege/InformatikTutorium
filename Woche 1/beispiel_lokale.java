public class beispiel_lokale {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println(test(a,b));
    }

    static int test(int b,int a) { //lokale variablen immer betraten, nicht mit lokalen anderer funktionen oder globalen variablen verwechseln
        return a-b;
    }
}
