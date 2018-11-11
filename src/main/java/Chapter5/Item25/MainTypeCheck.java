package Chapter5.Item25;

import Chapter4.Item15.Complex;

import java.util.ArrayList;
import java.util.List;

public class MainTypeCheck {

    public static void main(String[] args) {

        /**
         * Arrays know and enforce their element types at runtime
         */
        // Fails at runtime!
        Object[] sampleArray = new Long[1];
        sampleArray[0] = "I don't fit in"; // Throws ArrayStoreException
        System.out.println(sampleArray[0]);


        /**
         * Generics was added to provide compile-time type checking and removing risk of Exception
         *
         * Fixing compile-time errors is easier than fixing runtime errors
         */
        // Won't compile!
//        List<Object> sampleList = new ArrayList<Long>(); // Incompatible types
//        sampleList.add("I don't fit in");
//
//        System.out.println(sampleList.get(0));

    }
}
