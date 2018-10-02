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
        int tempDenL = this.denominator;
        int tempDenR = fraction.denominator;

        this.numerator = this.numerator*tempDenR;
        this.denominator = this.denominator*tempDenR;

        fraction.numerator = fraction.numerator*tempDenL;
        fraction.denominator = fraction.denominator*tempDenL;

        this.numerator = this.numerator + fraction.numerator;
        return this;
    }
}
