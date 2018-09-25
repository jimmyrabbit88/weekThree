public class Book {
    private String title = "";
    private float price = 0;
    private String isbn = "";
    private int noPages = 0;


    public void setTitle(String title) {
        this.title = title;
    }

    public void setPrice(float price){
        this.price = price;
    }

    public void setISBN(String isbn){
        this.isbn = isbn;
    }

    public void setNoPages(int noPages){
        this.noPages = noPages;
    }



    public String getTitle(){
        return title;
    }

    public float getprice(){
        return price;
    }

    public String getIsbn(){
        return isbn;
    }

    public int getNoPages(){
        return noPages;
    }

    public Book(){
        this.title ="No Title";
        this.isbn = "No ISBN";
        this.price = 0.00f;
        this.noPages = 0;
    }

    public Book(String title, float price, String isbn, int noPages){
        setTitle(title);
        setPrice(price);
        setISBN(isbn);
        setNoPages(noPages);
    }

    public String toString(){
        String str = "";
    }
}
