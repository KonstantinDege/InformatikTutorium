package MusterklausurSo23.A9;

public class Aktie {
    private int Anzahl;
    public Aktie(int anzahl, AktienTyp aktienTyp) throws Exception{
        setAnzahl(anzahl);
        setAktienTyp(aktienTyp);
    }


    private AktienTyp aktienTyp;
    public AktienTyp getAktienTyp() {
        return aktienTyp;
    }

    public void setAktienTyp(AktienTyp aktienTyp) {
        this.aktienTyp = aktienTyp;
    }

    public int getAnzahl() {
        return Anzahl;
    }

    public void setAnzahl(int anzahl) throws Exception {
        if (anzahl < 0) throw new Exception("Amount must be greater then 0"); 
        Anzahl = anzahl;
    }


    public double getDividendenWert() {
        return Anzahl * aktienTyp.getDividende() * aktienTyp.getWert();
    }
}
