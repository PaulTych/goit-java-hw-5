package HW5;
import static java.lang.Math.pow;
public class Distance {
    private int startX;
    private int startY;
    private int endX;
    private int endY;

    Distance(int startX, int startY, int endX, int endY){
        this.startX = startX;
        this.startY = startY;
        this.endX = endX;
        this.endY = endY;
    }
    public int getDistance(){
        double dx = this.endX-this.startX;
        double dy = this.endY-this.startY;
        double distX = Math.pow(dx,2D);
        double distY = Math.pow(dy,2D);
        double result = Math.pow(distX+distY,0.5D);
        return (int) Math.round(Math.pow(Math.pow((double) this.endX-this.startX,2d)+Math.pow((double)  (this.endY-this.startY),2d),0.5d));
    }
}
