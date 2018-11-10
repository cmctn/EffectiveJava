package Chapter1.Item5;

public class Main5 {

    public static void main(String[] args) {

//        // immutable objects
//        // DON'T DO THIS
//        String s1 = new String("sample");
//
//        // DO
//        String s2 = "Sample";
//
//
//
//
//        // mutable objects
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        try {
//            java.util.Date yourDate = sdf.parse("1946-07-26");
//
//            PersonDont p1 = new PersonDont(yourDate);
//            System.out.println(p1.isBabyBoomer());
//
//
//
//            PersonDo p2 = new PersonDo(yourDate);
//            System.out.println(p2.isBabyBoomer());
//
//        } catch (ParseException e) {
//            e.printStackTrace();
//        }
//


        // slow program !!!!
        // the variable sum is declared as a Long instead of a long
        // which means the program constructs about 2^31 unnecessary Long instances !!!!
        Long sum = 0L;
        for (Long i=0L; i<=Long.MAX_VALUE; i++){
            sum += i;
        }

        int a = 5;
        Integer boxedA = a;
        int unboxedA = boxedA.intValue();

        /**
         *
         * prefer primitives to boxed primitives,
         * and watch out for unintentional autoboxing.
         *
         */





    }



}
