import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VendingMachine {
    private static int tokens;
    private static int cans;
    private static JButton insertToken, printValues, insertCans;



    public void insertToken(){
        if (cans > 0) {
            tokens++;
            cans--;
            JOptionPane.showMessageDialog(null, "You have purchased a can of soda", "Purchase",JOptionPane.INFORMATION_MESSAGE);
        }
        else
            JOptionPane.showMessageDialog(null, "Sorry we are out of soda","Error", JOptionPane.ERROR_MESSAGE);
    }

    public void showValues(){
         JOptionPane.showMessageDialog(null, "Cans = " + cans + "\nTokens = " + tokens);
    }

    public void fillUp(){
        int newCans = MyMethods.integerInput("How many cans did you put into the Machine", "Fill Cans");
        cans += newCans;
    }





    public VendingMachine(){
        this.tokens = 0;
        this.cans = 5;

        JFrame VMwin = new JFrame("Vending Machine");
        //FlowLayout flowLayout = new FlowLayout();
        VMwin.setLocation(600, 100);
        VMwin.setLayout(null);
        VMwin.setSize(215, 450);
        VMwin.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        insertToken = new JButton("Insert Token");
        insertToken.setLocation(25, 50);
        insertToken.setSize(150, 70);
        VMwin.add(insertToken);

        printValues = new JButton("Print Values");
        printValues.setLocation(25, 170);
        printValues.setSize(150, 70);
        VMwin.add(printValues);

        insertCans = new JButton("Insert Cans");
        insertCans.setLocation(25, 290);
        insertCans.setSize(150,70);
        VMwin.add(insertCans);

        ButtonEventHandler buttonHandler = new ButtonEventHandler();
        insertToken.addActionListener(buttonHandler);
        printValues.addActionListener(buttonHandler);
        insertCans.addActionListener(buttonHandler);

        VMwin.setVisible(true);


    }

    private class ButtonEventHandler implements ActionListener {
        public void actionPerformed(ActionEvent e){
            if(e.getSource() == insertToken){
                VmDriver.vm1.insertToken();
            }
        else if(e.getSource() == printValues){
                VmDriver.vm1.showValues();
            }
            else if(e.getSource() == insertCans){
                VmDriver.vm1.fillUp();
            }
        }
    }
}
