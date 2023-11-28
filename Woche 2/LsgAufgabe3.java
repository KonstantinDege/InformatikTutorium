public class LsgAufgabe3 { //WS1314
    public static void main(String[] args) {
        System.out.println(subfak(6)); 
        System.out.println(subfakeasier(6));  
    }

    static public double subfak(int n) {
        double ret = 1; 
        int fak = 1;
        for (int k = 1; k <= n; k++) {
            fak = fak * k;
            ret = ret + Math.pow(-1, k)/fak;
        }
        return ret * fak;
    }
    static public double subfakeasier(int n) {
        double ret = 1; 
        int fak = 1;
        for (int k = 1; k <= n; k++) {
            fak = fak * k;
            double a = 1;
            if (k % 2 == 1) a=-1;
            ret = ret + a/fak;
        }
        return ret * fak;
    }
    static public double subfakeasier2(int n) {
        double ret = 1; 
        int fak = 1;
        int zaehler = 1;
        for (int k = 1; k <= n; k++) {
            fak = fak * k;
            zaehler = zaehler * -1;
            ret = ret + zaehler/fak;
        }
        return ret * fak;
    }
}
