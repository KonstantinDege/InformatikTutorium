package Woche_7;

import java.util.ArrayList;

public class Kunde extends Person {
    private String KundenNr;

    public Kunde(String name, String vorname, String kundenNr) {
        super(name, vorname);
        setKundenNr(kundenNr);
    }

    public String getKundenNr() {
        return KundenNr;
    }

    private void setKundenNr(String kundenNr) {
        KundenNr = kundenNr;
    }

    private Bankangestellter Betreuer; //Zuordnungspfeil 1
    public Bankangestellter getBetreuer() {
        return Betreuer;
    }

    public void setBetreuer(Bankangestellter betreuer) {
        Betreuer = betreuer;
    }

    private ArrayList<Konto> Konten = new ArrayList<Konto>(); //Zuordnungspfeil 2

    public ArrayList<Konto> getKonten() {
        return Konten;
    }

    public double berechneGesamtsaldo() {
        double res = 0;
        for (int i = 0; i < Konten.size(); i++) {
            res += Konten.get(i).getSaldo();
        }
        return res;

    }
}
