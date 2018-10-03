import javax.swing.*;
import java.awt.*;

public class MyMethods {
    public static int integerInput(String msg, String title){
        return Integer.parseInt(JOptionPane.showInputDialog(null, msg, title, 1));

    }

    public static String strInput(String msg, String title){
        return JOptionPane.showInputDialog(null, msg, title, 1);
    }

    public static float floatInput(String msg, String title){
        return Float.parseFloat(JOptionPane.showInputDialog(null, msg, title, 1 ));
    }

    public static JTextArea createArea() {
        JTextArea box1 = new JTextArea();
        box1.setFont(new Font("monospaced", Font.PLAIN, 12));
        return box1;
    }

}
