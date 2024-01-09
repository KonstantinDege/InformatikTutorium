package MusterklausurSo23.Aufgabe2Test;

public class Quersumme {
    public static void main(String[] args) {
        System.out.println(Quersumme(1111));
    }

    public static int Quersumme(int Zahl) {
        int res = 0;
        while (Zahl > 0) {
            res += Zahl%10;
            Zahl = Zahl/10;
        }
        return res;
    }
}
