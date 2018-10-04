import javax.swing.*;

public class BankAccountDriver {
    static BankAccount[] accounts = new BankAccount[5];
    static BankAccount acc;
    static int counter = 0;
    public static void main(String[] args) {
        while(true) {
            int choice = 0;
            choice = menu();
            switch (choice) {
                case 1:
                    newAccount();
                    break;
                case 0:
                    acc = accounts[3];
                    System.out.println(acc.toString());
                    System.exit(0);
                    break;

            }
        }
    }

    public static void newAccount(){
        int confirm = 0;
        Person person = new Person();
        BankAccount acc;
        do {
            person.setName(JOptionPane.showInputDialog(null, "enter name of Person opening new account"));
            acc = new BankAccount(Integer.toString(counter), 100, person);
            confirm = JOptionPane.showConfirmDialog(null, acc.toString(), "Save Details", JOptionPane.OK_CANCEL_OPTION);
        }while(confirm == -1);
        accounts[counter] = acc;
        counter++;

    }

    public static int menu(){
        return MyMethods.integerInput("Please chose an option\n\n1 :: add new Account\n\n0 :: Quit", "Menu");    }
}
