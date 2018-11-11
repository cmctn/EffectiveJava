package Chapter3.Item12;


import java.util.Random;

public class PhoneNumberComparable implements Comparable<PhoneNumberComparable>{

    private final short areaCode;
    private final short prefix;
    private final short lineNumber;

    public PhoneNumberComparable(int areaCode, int prefix, int lineNumber) {
        rangeCheck(areaCode, 999, "area code");
        rangeCheck(prefix, 999, "prefix");
        rangeCheck(lineNumber, 9999, "line number");
        this.areaCode = (short) areaCode;
        this.prefix = (short) prefix;
        this.lineNumber = (short) lineNumber;
    }

    private static void rangeCheck(int arg, int max, String name) {
        if (arg < 0 || arg > max)
            throw new IllegalArgumentException(name + ": " + arg);
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumberComparable))
            return false;
        PhoneNumberComparable pn = (PhoneNumberComparable) o;
        return pn.lineNumber == lineNumber && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + areaCode;
        result = 31 * result + prefix;
        result = 31 * result + lineNumber;
        return result;
    }

    @Override
    public String toString() {
        return String.format("(%03d) %03d-%04d", areaCode, prefix, lineNumber);
    }


    // Works fine, but can be made faster
    // public int compareTo(PhoneNumberComparable pn) {
    // // Compare area codes
    // if (areaCode < pn.areaCode)
    // return -1;
    // if (areaCode > pn.areaCode)
    // return 1;
    //
    // // Area codes are equal, compare prefixes
    // if (prefix < pn.prefix)
    // return -1;
    // if (prefix > pn.prefix)
    // return 1;
    //
    // // Area codes and prefixes are equal, compare line numbers
    // if (lineNumber < pn.lineNumber)
    // return -1;
    // if (lineNumber > pn.lineNumber)
    // return 1;
    //
    // return 0; // All fields are equal
    // }

    public int compareTo(PhoneNumberComparable pn) {
        // Compare area codes
        int areaCodeDiff = areaCode - pn.areaCode;
        if (areaCodeDiff != 0)
            return areaCodeDiff;

        // Area codes are equal, compare prefixes
        int prefixDiff = prefix - pn.prefix;
        if (prefixDiff != 0)
            return prefixDiff;

        // Area codes and prefixes are equal, compare line numbers
        return lineNumber - pn.lineNumber;
    }

//    public static void main(String[] args) {
//        NavigableSet<PhoneNumberComparable> s = new TreeSet<PhoneNumberComparable>();
//        for (int i = 0; i < 10; i++)
//            s.add(randomPhoneNumber());
//        System.out.println(s);
//    }

    private static final Random rnd = new Random();

    private static PhoneNumberComparable randomPhoneNumber() {
        return new PhoneNumberComparable((short) rnd.nextInt(1000),
                (short) rnd.nextInt(1000), (short) rnd.nextInt(10000));
    }



}
