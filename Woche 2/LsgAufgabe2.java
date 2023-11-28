public class LsgAufgabe2 { //Taylor von e
    public static void main(String[] args) {
        System.out.println(berechne(1, 1000));
        System.out.println("Close to e?  " + (Math.round((berechne(1, 10000)-Math.E)*1000)/1000  == 0));
    }
    
    static public float berechne(float x, int steps) {
        float a = 0;
        float zaehler = 1;
        float nenner = 1;
        for (int i = 1; i <= steps; i++) {
            a += zaehler/nenner;
            zaehler *= x;
            nenner *= i;
        }
        return a;
    }
}
