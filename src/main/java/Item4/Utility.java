package Item4;

// Noninstantiable utility class
public class Utility {

    // Suppress default constructor for noninstantiability  !!!!
    private Utility() {

        // AssertionError isnt strictly required.
        // it provides insurance in case the constructor is accidentally invoked from within the class.
        throw new AssertionError();
    }

}
