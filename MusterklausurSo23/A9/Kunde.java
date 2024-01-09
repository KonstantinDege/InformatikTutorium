package MusterklausurSo23.A9;

public class Kunde {
    private String KundenNr;
    public Kunde(String kundenNr) throws Exception {
        setKundenNr(kundenNr);
    }

    private Aktie[] aktien;
    public Aktie[] getAktien() {
        return aktien;
    }

    public String getKundenNr() {
        return KundenNr;
    }

    public void setKundenNr(String kundenNr) throws Exception {
        if (kundenNr == null || kundenNr.isBlank() || kundenNr.isEmpty()) throw new Exception("kundenNr needs to be a valid string"); 
        KundenNr = kundenNr;
    }

    public double getGesamtwert() {
        double res = 0;
        for (int i = 0; i < aktien.length; i++) {
            res += aktien[i].getDividendenWert();
        }
        return res;
    }
}
