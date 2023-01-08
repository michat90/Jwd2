package pl.edu.wszib.jwd.zajecia2;

import java.awt.*;

public class FourDPoint extends Point {
    int z;
    int t;

    /*public pl.edu.wszib.jwd.zajecia2.FourDPoint(int y, int x, int z, int t){
        super(x,y);
        this.z = z;
        this.t = t;
    }*/

    static FourDPoint create(int x, int y, int z, int t) {
        FourDPoint fourDPoint = new FourDPoint();
        fourDPoint.x = x;
        fourDPoint.y = y;
        fourDPoint.z = z;
        fourDPoint.t = t;
        return fourDPoint;
    }

    void show(){
        System.out.println("x = " + this.x);
        System.out.println("y = " + this.y);
        System.out.println("z = " + this.z);
        System.out.println("t = " + this.t);
    }

    public static void main(String[] args) {
        FourDPoint fourDPoint = create(1,2,3,4);
        fourDPoint.show();
    }

}
