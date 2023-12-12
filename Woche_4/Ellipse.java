package Woche_4;

public class Ellipse {
    double abstandsumme = 3;
    double x1 = -1;
    double x2 = 1;
    double y1 = 0;
    double y2 = 0;
    
    public Ellipse(double abstandsumme, double x1, double x2, double y1, double y2) throws Exception {
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");
        this.abstandsumme = abstandsumme;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public Ellipse() {
    }
    public double getAbstandsumme() {
        return abstandsumme;
    }
    public void setAbstandsumme(double abstandsumme) throws Exception{
        if (abstandsumme <= 0) throw new Exception("Abstandssumme muss größer null sein");
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");
        this.abstandsumme = abstandsumme;
    }
    public double getX1() {
        return x1;
    }
    public void setX1(double x1) throws Exception {
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");
        this.x1 = x1;
    } 
    public double getX2() {
        return x2;
    }
    public void setX2(double x2) throws Exception {
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");
        this.x2 = x2;
    }   
        public double getY1() {
        return y1;
    }
    public void setY1(double y1) throws Exception {
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");

        this.y1 = y1;
    }
    public double getY2() {
        return y2;
    }
    public void setY2(double y2) throws Exception {
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");
        this.y2 = y2;
    }


    public void setter(double abstandsumme, double x1, double x2, double y1, double y2) throws Exception {
        double abstand = Math.sqrt(Math.pow((x1-x2),2) + Math.pow((y1-y2),2));
        if (abstand < abstandsumme) throw new Exception("Abstand muss kleiner als Abstandsumme sein");
        this.abstandsumme = abstandsumme;
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    public void setter(Ellipse elli) throws Exception {
        setter(elli.getAbstandsumme(), elli.getX1(), elli.getX2(), elli.getY1(), elli.getY2());
    }

    public boolean inside(double x, double y) {
        double abstand1 = Math.sqrt(Math.pow((x-x1),2) + Math.pow((y-y1),2));
        double abstand2 = Math.sqrt(Math.pow((x-x2),2) + Math.pow((y-y2),2));
        return abstandsumme >= abstand1 + abstand2;
    }

}
