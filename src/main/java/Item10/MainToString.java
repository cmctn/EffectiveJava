package Item10;

public class MainToString {

    public static void main(String[] args) {


        PhoneNumber phoneNumber = new PhoneNumber(212,651,9876);

        // output before overriding toString()
        // Item10.PhoneNumber@5674cd4d
        System.out.println(phoneNumber.toString());



    }
}
