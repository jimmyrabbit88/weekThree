public class YourBooks {
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
        choice = MyMethods.integerInput("Please chose an option \n\n1 :: Add new Book \n\n2 :: Display your Books \n\n3 :: Quit", "My Library");
        return choice;
    }

    public static void addBook(){
        Book book = new Book();
        book.setTitle(MyMethods.strInput("Please enter the Title of the book you want to add", "Add Title"));
        book.setPrice(MyMethods.floatInput("Please enter the price of the book you want to add", "Add Price"));
        book.setISBN(MyMethods.strInput("Please enter the ISBN of the book you want to add", "Add ISBN"));
        book.setNoPages(MyMethods.integerInput("Please enter the Number of Pages in the book you want to add", "Add Number of Pages"));
    }

    public static void displayBooks(){

    }
}
