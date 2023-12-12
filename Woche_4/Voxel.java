package Woche_4;

public class Voxel {
    private int x = 0;
    private int y = 0;
    private int z = 0;
    private int color = 0;
    
    public Voxel(int x, int y, int z, int color) throws Exception {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        this.setColor(color);
    }
    public void set(int x, int y, int z, int color) throws Exception {
        this.setX(x);
        this.setY(y);
        this.setZ(z);
        this.setColor(color);
    }
    public void set(Voxel Voxel2) throws Exception {
        this.setX(Voxel2.getX());
        this.setY(Voxel2.getY());
        this.setZ(Voxel2.getZ());
        this.setColor(Voxel2.getColor());
    }
    public Voxel() {
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
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    public int getColor() {
        return color;
    }
    public void setColor(int color) throws Exception {
    	if (color < 0 || color > 3) throw new Exception("Invalid colour");
        this.color = color;
    }

    public void verschiebung(int _x, int _y, int _z) {
        this.setX(this.getX() + _x);
        this.setY(this.getY() + _y);
        this.setZ(this.getZ() + _z);
    }

    public Voxel new_mirror() throws Exception {
        return new Voxel(this.getX(), this.getY(), -this.getZ(), this.getColor());
    }
}
