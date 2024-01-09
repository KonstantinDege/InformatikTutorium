package Woche_6;

public class main {
    public static void main(String[] args) throws Exception {
        Kreis eins = new Kreis(5,5,5);
        Kreis zwei = new Kreis(10,10,3);

        System.out.println(eins.Umkreis());
        System.out.println(zwei.Umkreis());

        System.out.println(eins.ueberlappen(zwei));
    }

}
