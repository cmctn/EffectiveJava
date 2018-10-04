package Item12;

public class MainComparable {

    public static void main(String[] args) {


        /**
         *  unlike the other methods discussed in this chapter,
         *  the compareTo method isn't declared in Object.
         *
         *  contract:
         *
         *  sgn(x.compareTo(y)) == - sgn(y.compareTo(x))   for all x and y
         *
         *  transitive : (x.compareTo(y)>0 && y.compareTo(z)>0)   implies x.compareTo(z)>0
         *
         *  x.compareTo(y)==0 implies that
         *  sgn(x.compareTo(z))==sgn(y.compareTo(z))  ,for all z
         */

        PhoneNumberComparable pN = new PhoneNumberComparable(212,345, 4764);
        PhoneNumberComparable pN2 = new PhoneNumberComparable(212,345, 1234);
        PhoneNumberComparable pN3 = new PhoneNumberComparable(212,345, 4764);


        System.out.println(pN.compareTo(pN2));
        System.out.println(pN.compareTo(pN3));


    }

}
