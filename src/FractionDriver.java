public class FractionDriver {
    public static void main(String[] args) {

        Fraction fraction = new Fraction(15, 25);
        Fraction fraction2 = new Fraction(10, 20);

        fraction = fraction.doAdd(fraction2);
        System.out.println(fraction);

    }
}
