package Woche_5;

public class Medien {
    private String Titel;
    public String getTitel() {
        return Titel;
    }

    public void setTitel(String titel) throws Exception {
        if (titel == null || titel.isBlank() || titel.isEmpty()) throw new Exception("Title needs to be a valid string"); 
        Titel = titel;
    }

    private String Autor;
    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) throws Exception {
        if (autor == null || autor.isBlank() || autor.isEmpty()) throw new Exception("Author needs to be a valid string"); 

        Autor = autor;
    }

    private String Verlag;
    public String getVerlag() {
        return Verlag;
    }

    public void setVerlag(String verlag) throws Exception {
        if (verlag == null || verlag.isBlank() || verlag.isEmpty()) throw new Exception("Publisher needs to be a valid string"); 
        Verlag = verlag;
    }

    private String Standort;
    public String getStandort() {
        return Standort;
    }

    public void setStandort(String standort) throws Exception {
        if (standort == null || standort.isBlank() || standort.isEmpty()) throw new Exception("Place needs to be a valid string"); 

        Standort = standort;
    }

    private String IdentNummer;
    
    public String getIdentNummer() {
        return IdentNummer;
    }

    public void setIdentNummer(String IdentNummer) throws Exception {
        if (IdentNummer == null || IdentNummer.isBlank() || IdentNummer.isEmpty()) throw new Exception("Place needs to be a valid string"); 
        this.IdentNummer = IdentNummer;
    }

    public Medien(String titel, String autor, String verlag, String standort, String identNummer) throws Exception {
        setTitel(titel);
        setAutor(autor);
        setVerlag(verlag);
        setStandort(standort);
        setIdentNummer(identNummer);
    }


}
