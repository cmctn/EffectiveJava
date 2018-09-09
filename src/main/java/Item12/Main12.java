package Item12;

public class Main12 {

    public static void main(String[] args) {

        PhoneNumberComparable pN = new PhoneNumberComparable(212,345, 4764);
        PhoneNumberComparable pN2 = new PhoneNumberComparable(212,345, 1234);
        PhoneNumberComparable pN3 = new PhoneNumberComparable(212,345, 4764);


        System.out.println(pN.compareTo(pN2));
        System.out.println(pN.compareTo(pN3));


    }

}
