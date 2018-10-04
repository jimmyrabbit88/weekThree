public class VendingMachine {
    private int tokens = 0;
    private int cans = 0;

    public int insertToken(){
        if (cans > 0) {
            tokens++;
            cans--;
            return 1;
        }
        else
            return 0;
    }

    public String toString(){
        return "Cans = " + cans + "\nTokens = " + tokens;
    }

    public void fillUp(int cans){
        cans += cans
    }
}
