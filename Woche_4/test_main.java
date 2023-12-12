package Woche_4;

public class test_main {
    public static void main(String[] args) throws Exception{
        Voxel_LSG vex1 = new Voxel_LSG(1,1,1,3);
        Voxel_LSG vex2 = vex1.mirror();
        System.out.println(vex2.getZ());
    }
}
