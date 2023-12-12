package Woche_4;

public class Voxel_LSG {
    int x = 0;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        this.x = x;
    }
    int y = 0;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    int z = 0;
    public int getZ() {
        return z;
    }
    public void setZ(int z) {
        this.z = z;
    }
    int color = 0;
    public int getColor() {
        return color;
    }
    public void setColor(int color) throws Exception{
        if (color < 0 || color > 3) throw new Exception("Invalid Color");
        this.color = color;
    }
    public Voxel_LSG(int x, int y, int z, int color) throws Exception {
        setColor(color);
        setX(x);
        setY(y);
        setZ(z);
    }
    public Voxel_LSG() {
    }
    public void set(int x, int y, int z, int color) throws Exception {
        setColor(color);
        setX(x);
        setY(y);
        setZ(z);
    }
    public void set(Voxel_LSG vox) throws Exception{
        setColor(vox.getColor());
        setX(vox.getX());
        setY(vox.getY());
        setZ(vox.getZ());
    }
    public void move(int _x, int _y, int _z) {
        setX(x+_x);
        setY(y+_y);
        setZ(z+_z);
    }
    public Voxel_LSG mirror() throws Exception{
        return new Voxel_LSG(x,y,-z,color);
    }


}
