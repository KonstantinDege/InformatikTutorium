package Woche_7;

public class Konto {
    private String KontoNr;
    private double Saldo;
    public Konto(String kontoNr, double saldo) {
        setKontoNr(kontoNr);
        setSaldo(saldo);
    }
    public String getKontoNr() {
        return KontoNr;
    }
    private void setKontoNr(String kontoNr) {
        KontoNr = kontoNr;
    }
    public double getSaldo() {
        return Saldo;
    }
    public void setSaldo(double saldo) {
        Saldo = saldo;
    }
}
