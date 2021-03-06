package HW5;

public class CircleIntersector {
    private int x1;
    private int y1;
    private int r1;
    private int x2;
    private int y2;
    private int r2;

    public CircleIntersector(int x1, int y1, int r1, int x2, int y2, int r2) {
        setX1(x1);
        setY1(y1);
        setR1(r1);
        setX2(x2);
        setY2(y2);
        setR2(r2);
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getR1() {
        return r1;
    }

    public void setR1(int r1) {
        this.r1 = r1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getR2() {
        return r2;
    }

    public void setR2(int r2) {
        this.r2 = r2;
    }
    public double getDistance(double x1, double y1, double x2, double y2){
        double dX = Math.pow(x2-x1,2D);
        double dY = Math.pow(y2-y1,2D);
        return Math.pow(dX+dY,0.5D);
    }
    @Override
    public String toString() {
        if ((this.r1 + this.r2) >= getDistance(this.x1,this.y1,this.x2,this.y2)) {
            return "intersects";
        } else {
            return "not intersects";
        }
    }

}
