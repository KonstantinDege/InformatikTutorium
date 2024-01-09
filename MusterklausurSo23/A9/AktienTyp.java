package MusterklausurSo23.A9;

public class AktienTyp {
    private String ID;
    private double Wert;
    private double Dividende;

    public AktienTyp(String iD, double wert, double dividende) throws Exception {
        setDividende(dividende);
        setID(iD);
        setWert(wert);
    }
    public String getID() {
        return ID;
    }
    public void setID(String iD) throws Exception{
        if (iD == null || iD.isBlank() || iD.isEmpty()) throw new Exception("ID needs to be a valid string"); 
        ID = iD;
    }
    public double getWert()  {
        return Wert;
    }
    public void setWert(double wert) throws Exception {
        if (wert < 0) throw new Exception("Wert must be greater then 0"); 

        Wert = wert;
    }
    public double getDividende()  {
        return Dividende;
    }
    public void setDividende(double dividende) throws Exception {
        if (dividende < 0) throw new Exception("dividende must be greater then 0"); 
        Dividende = dividende;
    }
}
