public class FractionDriver {
    public static void main(String[] args) {

        Fraction fraction1 = new Fraction(15, 25);
        Fraction fraction2 = new Fraction(10, 20);
        Fraction fractionAdded = new Fraction();
        Fraction fractionSub = new Fraction();
        Fraction fractionMul = new Fraction();
        Fraction fractionDiv = new Fraction();


        fractionAdded = fraction1.doAdd(fraction2);
        System.out.println(fractionAdded);

        fractionSub = fraction1.doSubtract(fraction2);
        System.out.println(fractionSub);

        fractionMul = Fraction.doMul(fraction1, fraction2);
        System.out.println(fractionMul);

        fractionDiv = Fraction.doDiv(fraction1, fraction2);
        System.out.println(fractionDiv);
    }
}
