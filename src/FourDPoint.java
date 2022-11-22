import java.awt.*;
import java.util.Set;

public class FourDPoint extends Point {
    int z;
    int t;

    public FourDPoint(int y, int x, int z, int t){
        super(x,y);
        this.z = z;
        this.t = t;
    }

    public void show(){
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        System.out.println("t = " + t);
    }


}
