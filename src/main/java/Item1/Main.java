package Item1;

public class Main {
    /*
    They have names.
    They can cache.
    They can subtype.
    */

    public static void main(String[] args) {
        /**
         * they have names
         */

        // 1. use constructors
        // tomato - #FF6347 - rgb(255,99,71)
        ColorDefault tomatoDefault = new ColorDefault(255, 99, 71);
        System.out.println(tomatoDefault.getHex());


        // 2. use static factory methods
        ColorStatic tomatoStatic = ColorStatic.makeFromPalette(255, 99, 71);
        System.out.println(tomatoStatic.getHex());


        //3. use polymorphism and encapsulation
        ColorOther tomatoOther = new RGBColorOther(255, 99, 71);
        System.out.println(((RGBColorOther) tomatoOther).getOrigin()); // buradan getHex() 'e ulasamicak miyim??


        /**
         * they can cache
         */
        // 1. use constructors
        ColorDefault redDefault = new ColorDefault(255, 99, 71);
        System.out.println(System.identityHashCode(tomatoDefault));
        //will give the 'original' hash code of yourObject as an integer.
        System.out.println(System.identityHashCode(redDefault));


        // 2. use static factory methods
        // !!!! burada ayni degeri gormeyi bekliyordum
        ColorStatic redStatic = ColorStatic.makeFromPalette(255, 99, 71);
        System.out.println(System.identityHashCode(tomatoStatic));
        System.out.println(System.identityHashCode(redStatic));


        /**
         * they can subtype
         */
    }


}
