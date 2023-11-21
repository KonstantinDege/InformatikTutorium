public class summeWithError{
    public static void main(String[] args) throws Exception
    {
        System.out.println(summe(-10));
    }
    public static int summe(int n) throws Exception{
        if (n < 1) throw new Exception("nur werte größer null können verarbeitet werden"); // theoretisch sind lösung für kleiner eins nicht definiert, zusatz nicht unbedingt nötig
        if (n == 1) { //ergänzung um unendliche schleife zu unterbinden
            return 1;
        }        
        return n + summe(n-1);
    }


}
