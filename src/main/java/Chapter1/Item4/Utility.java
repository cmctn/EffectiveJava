package Chapter1.Item4;

// Noninstantiable utility class
public class Utility {

    static Utility u = new Utility();

    public static Utility getB(){
        return u;
    }

    // Suppress default constructor for noninstantiability  !!!!
    private Utility() {

        // AssertionError isnt strictly required.
        // it provides insurance in case the constructor is accidentally invoked from within the class.
        throw new AssertionError();
    }

}
