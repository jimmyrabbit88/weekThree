public class BookTest {
    public static void main(String[] args) {
        // test  empty init
        Book test1 = new Book();
        System.out.println(test1.toString());

        // test full init
        Book test2 = new Book("jaws", 10.99f, "abc1234", 2345);
        System.out.println(test2.toString());


        //test setters
        Book test3 = new Book();
        test3.setTitle("harry Potter");
        test3.setPrice(12.55f);
        test3.setISBN("1111hphp");
        test3.setNoPages(999);



        // test getters

        System.out.println(test3.getTitle());
        System.out.println(test3.getprice());
        System.out.println(test3.getIsbn());
        System.out.println(test3.getNoPages());

        //

    }
}
