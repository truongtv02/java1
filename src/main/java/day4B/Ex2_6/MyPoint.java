package day4B.Ex2_6;

public class MyPoint {
    private int x = 0;
    private int y = 0;

    public MyPoint(){
    }


    public MyPoint(int x, int y) {
        this.x = x;
        this.y = y;
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

    public int[] getXY() {
        return new int[]{x,y};
    }
    public void setXY(int x, int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public String toString() {
        return String.format("(%d,%d)",x,y);

    }
    public double distance (int x, int y){
        int dis1 = this.x - x;
        int dis2 = this.y - y;
        return Math.sqrt(dis1*dis1 + dis2*dis2);
    }
    public double distance ( MyPoint another){
//        int dis1 = this.x - another.x;
//        int dis2 = this.y - another.y;
//        return Math.sqrt(dis1*dis1 + dis2*dis2);
        return distance(another.x, another.y);
    }
    public double distance(){
        return distance(0,0);
    }
}
