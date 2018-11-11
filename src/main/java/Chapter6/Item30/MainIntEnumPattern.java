package Chapter6.Item30;

public class MainIntEnumPattern {

    /**
     * The compiler won't complain if you pass an apple to a method
     * that expects an orange.
     *
     * There is no easy way to translate int enum constants into printable strings.
     * If you print such a constant or display it from a debugger, all you see is a number, which isn’t very helpful.
     *
     * You may encounter a variant of this pattern in which String constants are used in place of int constants.
     * This variant, known as the String enum pattern, is even less desirable.
     * It can lead naive users to hard-code string constants into client code instead of using field names.
     */

    // The int enum pattern - severely deficient!
    public static final int APPLE_FUJI =0;
    public static final int APPLE_PIPPIN =1;
    public static final int APPLE_GRANNY_SMITH = 2;

    public static final int ORANGE_NAVEL  = 0;
    public static final int ORANGE_TEMPLE = 1;
    public static final int ORANGE_BLOOD  = 2;

    public static void main(String[] args) {


    }
}
