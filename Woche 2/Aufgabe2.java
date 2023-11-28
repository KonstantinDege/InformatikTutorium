public class Aufgabe2 {
    public static float taylor(float x, int n) {
        int i = 1;
        float erg = 1;
        long fak = 1;
        float zahler = x;
        while (n>i) {
            zahler = zahler*x;
            fak = fak*i;
            erg = erg + (float)(zahler/fak);
            i++;
        }
        return erg;
    }
    public static void main(String[] args) {
        System.out.println(taylor(1, 50));
    }
}
