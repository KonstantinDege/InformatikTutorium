package Woche_5;

import java.util.ArrayList;

public class Benutzer {
    private String Kennung;

    private String Vorname;

    private String Name;

    private String Addresse;

    // Zuordnungen
    private ArrayList<Medien> Vorbestellt = new ArrayList<Medien>();
    public ArrayList<Medien> getVorbestellt() {
        return Vorbestellt;
    }
    private Medien[] Ausgeliehen;

    public void setAusgeliehen(Medien[] ausgeliehen) {
        Ausgeliehen = ausgeliehen;
    }
    public Medien[] getAusgeliehen() {
        return Ausgeliehen;
    }
    public String getAddresse() {
        return Addresse;
    }
    public void setAddresse(String addresse) throws Exception {
        if (addresse == null || addresse.isBlank() || addresse.isEmpty()) throw new Exception("Addresse needs to be a valid string"); 
        Addresse = addresse;
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getKennung() {
        return Kennung;
    }
    public void setKennung(String kennung) {
        Kennung = kennung;
    }
    public String getVorname() {
        return Vorname;
    }
    public void setVorname(String vorname) {
        Vorname = vorname;
    }


    
    

}
