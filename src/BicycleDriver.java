import javax.swing.*;

public class BicycleDriver {

    public static void main(String[] args) {
        String owner = JOptionPane.showInputDialog(null, "Please enter owners name:");
        String make = JOptionPane.showInputDialog(null, "Please enter make of bike");
        double price = Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of the bike"));
        Bicycle bike1 = new Bicycle(owner, make, price);

        Bicycle bike2 = new Bicycle();
        bike2.setOwnerName(JOptionPane.showInputDialog(null, "Please enter owners name:"));
        bike2.setMake(JOptionPane.showInputDialog(null, "Please enter make of bike"));
        bike2.setPrice(Double.parseDouble(JOptionPane.showInputDialog(null, "Please enter the price of the bike")));

        bike1.setPrice(bike1.getPrice()+ 10);


        JOptionPane.showMessageDialog(null, (bike1.getOwnerName() + " ::: " + bike1.getPrice() + "\n" + bike2.getOwnerName() + " ::: " + bike2.getPrice()));




    }
}
