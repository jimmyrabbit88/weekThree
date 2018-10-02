public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator){
        setNumerator(numerator);
        setDenominator(denominator);
    }

    public Fraction(){
        this (0, 1);
    }


    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString(){
        return Integer.toString(numerator) + "/" + Integer.toString(denominator);
    }

    public Fraction doAdd(Fraction fraction){

        int num = (this.numerator*fraction.denominator)+(fraction.numerator*this.denominator);
        int den = (this.denominator*fraction.denominator);
        Fraction ansFrac = new Fraction(num, den);
        return ansFrac;
    }

    public Fraction doSubtract(Fraction fraction){
        int num = (this.numerator*fraction.denominator)-(fraction.numerator*this.denominator);
        int den = (this.denominator*fraction.denominator);
        Fraction ansFrac = new Fraction(num, den);
        return ansFrac;
    }

    public static Fraction doMul(Fraction f1, Fraction f2){
        int num = (f1.numerator * f2.numerator);
        int den = (f1.denominator * f2.denominator);
        Fraction ansFrac = new Fraction(num, den);
        return ansFrac;
    }

    public static Fraction doDiv(Fraction f1, Fraction f2){
        int num = (f1.numerator * f2.denominator);
        int den = (f1.denominator * f2.numerator);
        Fraction ansFrac = new Fraction(num, den);
        return ansFrac;
    }

}
