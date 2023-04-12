public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (numerator != 0 && denominator != 0) {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        else {
            throw new IllegalArgumentException();
        }
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public String toString() {
        return numerator + "/" + denominator;
    }

    public Fraction addition(Fraction fraction) {
        if (fraction.numerator == 0 || fraction.denominator == 0) {
            throw new IllegalArgumentException();
        }

        int newDenominator = leastCommonMultiple(fraction.denominator, this.denominator);
        int newNumerator = fraction.numerator * (newDenominator / fraction.denominator) +
                this.numerator * (newDenominator / this.denominator);

        return simplify(newNumerator, newDenominator);
    }

    public Fraction addition(int fractionNumerator, int fractionDenominator) {
        if (fractionNumerator == 0 || fractionDenominator == 0) {
            throw new IllegalArgumentException();
        }

        int newDenominator = leastCommonMultiple(fractionDenominator, this.denominator);
        int newNumerator = fractionNumerator * (newDenominator / fractionDenominator) +
                this.numerator * (newDenominator / this.denominator);

        return simplify(newNumerator, newDenominator);
    }

    //asdasas

    public Fraction subtraction(Fraction fraction) {
        //TODO
        if (fraction.numerator == 0 || fraction.denominator == 0) {
            throw new IllegalArgumentException();
        }

        int newDenominator = leastCommonMultiple(fraction.denominator, this.denominator);
        int newNumerator = this.numerator * (newDenominator / this.denominator)
                - fraction.numerator * (newDenominator / fraction.denominator);

        return simplify(newNumerator, newDenominator);
    }

    public Fraction subtraction(int fractionNumerator, int fractionDenominator) {
        //TODO
        if (fractionNumerator == 0 || fractionDenominator == 0) {
            throw new IllegalArgumentException();
        }

        int newDenominator = leastCommonMultiple(fractionDenominator, this.denominator);
        int newNumerator = this.numerator * (newDenominator / this.denominator)
                - fractionNumerator * (newDenominator / fractionDenominator);

        return simplify(newNumerator, newDenominator);
    }

    public Fraction multiplication(int fractionNumerator, int fractionDenominator) {
        if (fractionNumerator == 0 || fractionDenominator == 0) {
            throw new IllegalArgumentException();
        }

        return simplify(this.numerator * fractionNumerator, this.denominator * fractionDenominator);
    }

    public Fraction multiplication(Fraction fraction) {
        if (fraction.numerator == 0 || fraction.denominator == 0) {
            throw new IllegalArgumentException();
        }

        return simplify(this.numerator * fraction.numerator, this.denominator * fraction.denominator);
    }

    public Fraction division(int fractionNumerator, int fractionDenominator) {
        if (fractionNumerator == 0 || fractionDenominator == 0) {
            throw new IllegalArgumentException();
        }

        return simplify(this.numerator * fractionDenominator, this.denominator * fractionNumerator);
    }

    public Fraction division(Fraction fraction) {
        if (fraction.numerator == 0 || fraction.denominator == 0) {
            throw new IllegalArgumentException();
        }

        return simplify(this.numerator * fraction.denominator, this.denominator * fraction.numerator);
    }

    private Fraction simplify(int numerator, int denominator) {
        int newNumerator = leastCommonMultiple(denominator, numerator) / Math.max(numerator, denominator);

        if (newNumerator < numerator) {
            return new Fraction(newNumerator, (denominator / (numerator / newNumerator)));
        }

        return new Fraction(numerator, denominator);
    }

    private static int greatestCommonDivisor(int a, int b) {
        if (b == 0) {
            return a;
        }

        return greatestCommonDivisor(b, a % b);
    }

    private static int leastCommonMultiple(int a, int b) {
        return a * b / greatestCommonDivisor(a, b);
    }
}
