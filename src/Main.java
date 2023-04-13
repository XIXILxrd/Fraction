public class Main {
    public static void main(String[] args) {
        Fraction fraction1 = new Fraction(12, 345);
        Fraction fraction2 = new Fraction(1, 4);
        Fraction fraction3 = new Fraction(5, 15);
        Fraction fraction4 = new Fraction(24, 80);

        System.out.println(fraction1.addition(fraction2)); //true
        System.out.println(fraction1.addition(fraction3)); //true
        System.out.println(fraction1.addition(fraction4)); //true

        System.out.println();

        System.out.println(fraction1.subtraction(fraction2)); //true
        System.out.println(fraction1.subtraction(fraction3)); //true
        System.out.println(fraction1.subtraction(fraction4)); //true

        System.out.println();

        System.out.println(fraction1.multiplication(fraction2)); //true
        System.out.println(fraction1.multiplication(fraction3)); //true
        System.out.println(fraction1.multiplication(fraction4)); //true

        System.out.println();

        System.out.println(fraction1.division(fraction2)); //true
        System.out.println(fraction1.division(fraction3)); //true
        System.out.println(fraction1.division(fraction4)); //true

    }
}