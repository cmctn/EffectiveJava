package Item15;

public class Main15 {

    public static void main(String[] args) {

        Complex complex = Complex.valueOf(1,5);
        System.out.println(complex.realPart());
        System.out.println(complex.imaginaryPart());


        Complex complexZero = Complex.ZERO;
        System.out.println(complexZero);



    }

}
