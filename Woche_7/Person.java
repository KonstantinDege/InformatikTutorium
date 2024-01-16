package Woche_7;

public class Person {
    private String Name;
    private String Vorname;
    public Person(String name, String vorname) {
        setName(vorname);
        setVorname(vorname);
    }
    public String getName() {
        return Name;
    }
    public void setName(String name) {
        Name = name;
    }
    public String getVorname() {
        return Vorname;
    }
    public void setVorname(String vorname) {
        Vorname = vorname;
    }
    
}
