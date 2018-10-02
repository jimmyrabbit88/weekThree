public class RecipieBook {
    private String name;
    private String desc;
    private int time;
    private String[] ingredents;
    private float price;


    public RecipieBook(String name, String desc, String[] ingredents, int time, float price){
        this.name = name;
        this.desc = desc;
        this.ingredents = ingredents;
        this.time = time;
        this.price = price;
    }

    public RecipieBook(){
        this ("No Name", "no desc", null, 0, 0f);
    }










    public void setName(String name) {
        this.name = name;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public void setIngredents(String[] ingredents) {
        this.ingredents = ingredents;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public void setTime(int time) {
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    public String[] getIngredents() {
        return ingredents;
    }

    public float getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }


}
