public class forschleifen {
    //beide schreibweisen sind korrekt

    public static int[] berechne1(int[] a ){
        int wert = a[0];
        for (int k = 0; k < a.length; k++) {
            if (a[k] > wert) {
                
            }
        }
        int[] res = {wert};
        return res;
    }
    public static int[] berechne2(int[] a ){
        int wert = a[0];
        for (int k = 0; k < a.length; k++) //keine geschweiftenklammern = nur die nächste funktion hier: if schleife
            if (a[k] > wert) {
                
            }
        int[] res = {wert};
        return res;
    }        
}
