public class Bicycle {
    private String ownerName;
    private String make;
    private double price;

    public Bicycle(){
        ownerName = "No Owner Details";
        make = "No make";
        price = 0;
    }

    public Bicycle(String ownerName, String make, double price){
        this.ownerName = ownerName;
        this.make = make;
        this.price = price;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getMake() {
        return make;
    }

    public double getPrice() {
        return price;
    }

    public String toString(){
        return "Owner : " + ownerName + "\nMake : " + make + "\nPrice : " + price + "\n";
    }
}
