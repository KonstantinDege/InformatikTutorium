package Woche_5;

public class Buch extends Medien {
    private int Seiten;
    public int getSeiten() {
        return Seiten;
    }
    public void setSeiten(int seiten) {
        Seiten = seiten;
    }
    public Buch(String titel, String autor, String verlag, String standort, String identNummer, int Seiten) throws Exception {
        super(titel, autor, verlag, standort, identNummer);
        setSeiten(Seiten);
    }
    
}
