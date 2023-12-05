public class Spielfigur {
    private int staerke = 15;
    private int verteidigung = 10;
    private int leben = 100;
    private punkt Standpunkt = new punkt(0,0);

    public Spielfigur(int staerke, int verteidigung, int leben, int x, int y) throws Exception{
        setLeben(leben);
        setVerteidigung(verteidigung);
        setStaerke(staerke);
        setStandpunkt(x, y);
    }
    public Spielfigur(int staerke, int verteidigung, int leben, punkt PunktA) throws Exception {
        setLeben(leben);
        setVerteidigung(verteidigung);
        setStaerke(staerke);
        setStandpunkt(PunktA);
    }
    public Spielfigur() {
        staerke = 15;
        leben = 100;
        verteidigung = 10;
        Standpunkt = new punkt(0,0);
    }
    
    public punkt getStandpunkt() {
        return Standpunkt;
    }
    public void setStandpunkt(int x, int y) {
        Standpunkt = new punkt(x,y);
    }
    public void setStandpunkt(punkt PunktA) {
        Standpunkt = PunktA;
    }
    public int getStaerke() {
        return staerke;
    }
    public void setStaerke(int staerke) {
        if (staerke < 0) throw new Exception("Stärke must be greater then 0"); 
        this.staerke = staerke;
    }
    public int getLeben() {
        return leben;
    }
    public void setLeben(int leben) throws Exception {
        if (leben < 0) throw new Exception("Leben müssen größer gleich null sein");
        this.leben = leben;
    }
    public int getVerteidigung() {
        return verteidigung;
    }
    public void setVerteidigung(int verteidigung) throws Exception {
        if (verteidigung < 0) throw new Exception("Leben müssen größer gleich null sein");
        this.verteidigung = verteidigung;
    }
    

    public void Angreifen(Spielfigur figurB) throws Exception {
        int lebenB = figurB.getLeben();
        lebenB = lebenB-(verteidigung-staerke);
        figurB.setLeben(lebenB);
    }
}
public class punkt {
    private int x;
    private int y;

    public punkt(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    
}
