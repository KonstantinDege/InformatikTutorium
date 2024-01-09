package MusterklausurSo23.A8;

public class Kreis {
    private double X = 0;
    private double Y = 0;
    private double R = 1;
    public Kreis() {
    }
    public Kreis(double x, double y, double r) throws Exception {
        setR(r);
        setX(x);
        setY(y);
    }
    public double getR() {
        return R;
    }
    public void setR(double r) throws Exception {
        if (r < 0) throw new Exception("Radius must be greater then 0"); 
        R = r;
    }
    public double getX() {
        return X;
    }
    public void setX(double x) {
        X = x;
    }
    public double getY() {
        return Y;
    }
    public void setY(double y) {
        Y = y;
    }
    public double Umkreis() {
        return 2 * Math.PI * getR();
    }
    public void Skalieren(double fak) throws Exception {
        if (fak < 0) throw new Exception("Skalefaktor must be greater then 0"); 
        R *= fak;
    }
    public boolean größer(Kreis anderer) {
        return this.getR() > anderer.getR();
    }
    public boolean überlappen(Kreis anderer) {
        double dis = Math.pow(this.getX()-anderer.getX(), 2) + Math.pow(this.getY()-anderer.getY(),2);
        return Math.pow(this.getR()+anderer.getR(),2) > dis;
    }
}
