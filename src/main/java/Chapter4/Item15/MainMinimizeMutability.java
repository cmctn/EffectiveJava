package Chapter4.Item15;

public class MainMinimizeMutability {

    public static void main(String[] args) {

        Complex complex = Complex.valueOf(1,5);
        System.out.println(complex.realPart());
        System.out.println(complex.imaginaryPart());


        Complex complexZero = Complex.ZERO;
        System.out.println(complexZero);



    }

}
