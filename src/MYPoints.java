public class MYPoints {
    private int xPoint = 0;
    private int yPoint = 0;

    public void setxPoint(int xPoint) {
        this.xPoint = xPoint;
    }

    public void setyPoint(int yPoint) {
        this.yPoint = yPoint;
    }

    public int getxPoint() {
        return xPoint;
    }

    public int getyPoint() {
        return yPoint;
    }

    public MYPoints(){
        xPoint = 0;
        yPoint = 0;
    }

    public MYPoints(int xPoint, int yPoint){
        setxPoint(xPoint);
        setyPoint(yPoint);
    }

    public String toString(){
        return "The x point is : " + getxPoint() + "\nThe y point is : " + getyPoint();
    }



    public void moveHorizontally(int y){
        this.yPoint += y;
    }

    public void moveVertically(int x){
        this.xPoint += x;
    }

    public void translate(int x, int y){
        this.yPoint += y;
        this.xPoint += x;
    }

    public double distanceFromOrigin(){
        return (Math.sqrt((Math.pow(this.xPoint, 2) + Math.pow(this.yPoint, 2))));
    }

}
