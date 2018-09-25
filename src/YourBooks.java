import javax.swing.*;

public class YourBooks {

    static Book[] myBooks = new Book[10];
    static int counter = 0;
    public static void main(String[] args) {
        int choice = 0;
        while (true){
            choice = startingOptions();
            switch (choice) {
                case 1:
                    addBook();
                    break;
                case 2:
                    displayBooks();
                    break;
                case 3:
                    System.exit(0);
                default:
                    return;
            }
        }
    }

    public static int startingOptions(){
        int choice =0;
        choice = MyMethods.integerInput("Please chose an option \n\n1 :: Add Favourite Book \n\n2 :: Display your Books \n\n3 :: Quit", "My Library");
        return choice;
    }

    public static void addBook(){
        Book book = new Book();
        book.setTitle(MyMethods.strInput("Please enter the Title of the book you want to add", "Add Title"));
        book.setPrice(MyMethods.floatInput("Please enter the price of the book you want to add", "Add Price"));
        String isbn =MyMethods.strInput("Please enter the ISBN of the book you want to add", "Add ISBN");
        //validateIsbn(isbn);
        book.setISBN(isbn);
        book.setNoPages(MyMethods.integerInput("Please enter the Number of Pages in the book you want to add", "Add Number of Pages"));
        myBooks[counter] = book;
        counter++;


    }

    public static void displayBooks(){
        JTextArea box1;
        box1 = MyMethods.createArea();
        box1.setText(String.format("%-20s%-7s%-15s%-20s\n", "Title", "Price", "ISBN", "Number of Pages"));
        for(int i = 0; i<counter; i++){
            Book book = new Book();
            book = myBooks[i];
            box1.append(String.format("%-20s%-7s%-15s%-20s\n", book.getTitle(), book.getprice(), book.getIsbn(), book.getNoPages()));
        }
        JOptionPane.showMessageDialog(null, box1);

    }

    public static int validateIsbn(String isbn){
        int len = isbn.length();
        if(len == 10 || len == 13){
            return 1;
        }
        else
            return 0;

    }
}
