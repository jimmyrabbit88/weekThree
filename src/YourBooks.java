public class YourBooks {
    public static void main(String[] args) {
        int choice = 0;
        choice = startingOptions();
    }

    public static int startingOptions(){
        int choice =0;
        choice = MyMethods.IntegerInput("Please chose an option \n\n1 :: Add new Book \n\n2 :: Display a Book \n\n3 :: Quit", "My Library");
    }
}
