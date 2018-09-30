import javax.swing.*;

public class MyPointsDriver {
    public static void main(String[] args) {
        MYPoints point1 = new MYPoints();
        MYPoints point2 = new MYPoints(2,2);
        JOptionPane.showMessageDialog(null, point1.toString());                         //0,0 expected
        JOptionPane.showMessageDialog(null, point2.toString());                         //2,2 expected
        point1.setxPoint(5);
        point1.setyPoint(5);
        int point1X = point1.getxPoint();
        int point1Y = point1.getyPoint();
        JOptionPane.showMessageDialog(null, point1X + " and " + point1Y);       // 5 and 5 expected
        point2.moveVertically(3);
        point2.moveHorizontally(4);
        JOptionPane.showMessageDialog(null, point2.toString());                         // 5, 6 expected

        MYPoints point3 = new MYPoints();
        point3.translate(3,4);

        int point3X = point3.getxPoint();
        int point3Y = point3.getyPoint();
        JOptionPane.showMessageDialog(null, point3X + " and " + point3Y);       // 3, 4 expected


        JOptionPane.showMessageDialog(null, point3.distanceFromOrigin());               // 5 expected


    }
}
