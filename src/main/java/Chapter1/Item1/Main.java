package Chapter1.Item1;

public class Main {
    /*
    SFMs have names.
    SFMs can cache.
    SFMs can subtype.
    */

    public static void main(String[] args) {
        /**
         * SFMs have names
         */
        // 1. use constructors
        // tomato - #FF6347 - rgb(255,99,71)
        ColorDefault tomatoDefault = new ColorDefault(255, 99, 71);
        System.out.println("tomatoDefault.getHex() : " + tomatoDefault.getHex());


        // 2. use static factory methods
        ColorStatic tomatoStatic = ColorStatic.makeFromPalette(255, 99, 71);
        System.out.println("tomatoStatic.getHex() : " + tomatoStatic.getHex());


        /**
         * SFMs can cache
         */
        //this would create a new instance for every call
        Byte b = new Byte( (byte) 65);

        // On every call, the method valueOf() will returns the same
        // instance of a Byte object representing the byte value 65.
        Byte b2 = Byte.valueOf( (byte) 65);

        System.out.println(b);
        System.out.println(b2);







    }


}
