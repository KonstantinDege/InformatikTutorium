package Woche_6;

public class Kreis {
    private double X = 0;
    private double Y = 0;
    private double Radius = 1;
    
    public Kreis(double x, double y, double radius) throws Exception { ///alle parameter
        setX(x);
        setY(y);
        setRadius(radius);
    }
    public Kreis() { //
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
    public double getRadius() {
        return Radius;
    }
    public void setRadius(double radius) throws Exception {
        if (radius < 0) throw new Exception("Radius must be greater then 0"); 
        Radius = radius;
    }

    public double Umkreis() {
        return getRadius() * 2 * Math.PI;
    }

    public void Skalieren(double skalfak) throws Exception {
        setRadius(skalfak*getRadius());
    }

    public boolean groesserals(Kreis anderer) {
        return this.getRadius() < anderer.getRadius(); 
    }

    public boolean ueberlappen(Kreis anderer) {
        double dis = Math.pow(X-anderer.getX(),2) + Math.pow(Y-anderer.getY(),2);
        return Math.pow(Radius + anderer.getRadius(),2) > dis;
    }
     
}
