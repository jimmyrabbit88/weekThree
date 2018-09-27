import javax.swing.*;

public class MessageDisplay {
    public static void main(String[] args) {
        Message message = new Message();
        Message message2 = new Message("James Dean", "Frank Sinatra", "Hello lad");


        JOptionPane.showMessageDialog(null, message.toString());
        JOptionPane.showMessageDialog(null, message2.toString());
        message.append("new Message");
        message2.append("you ready for the show?");
        JOptionPane.showMessageDialog(null, message.toString());
        JOptionPane.showMessageDialog(null, message2.toString());
    }
}
