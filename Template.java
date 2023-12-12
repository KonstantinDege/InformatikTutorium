import java.util.ArrayList;

public class Template {
	private int a = 0;
	private String b = "Hallo";
	private int C = 0;
    private ArrayList<String> Test = new ArrayList<String>();
    
    public int getA() {
        return a;
    }
    public void setA(int a) throws Exception {
        if (a < 0) throw new Exception("must be greater then 0"); 
        this.a = a;
    }
    public String getB() {
        return b;
    }
    public void setB(String b) throws Exception {
        if (b == null || b.isBlank() || b.isEmpty()) throw new Exception("needs to be a valid string"); 
        this.b = b;
    }
    
    
    //set with try catch
    public void setABC() {
    	try {
    		setB("Test");
    	} catch (Exception c) {
    		
    	}
    }
    
    public void setC(int c) throws Exception {
    	if (c < 0 || c > 15) throw new Exception("not a valid colour");
        C = c;
    }


}
