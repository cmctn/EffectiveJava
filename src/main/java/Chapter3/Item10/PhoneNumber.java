package Chapter2.Item10;

public class PhoneNumber {

    private final short areaCode, prefix, lineNum;
    private volatile int hashCode;


    public PhoneNumber(int areaCode, int prefix, int lineNum) {
        this.areaCode = rangeCheck(areaCode, 999, "area code");
        this.prefix   = rangeCheck(prefix,   999, "prefix");
        this.lineNum  = rangeCheck(lineNum, 9999, "line num");
    }

    private static short rangeCheck(int val, int max, String arg) {
        if (val < 0 || val > max)
            throw new IllegalArgumentException(arg + ": " + val);
        return (short) val;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof PhoneNumber))
            return false;
        PhoneNumber pn = (PhoneNumber)o;
        return pn.lineNum == lineNum && pn.prefix == prefix
                && pn.areaCode == areaCode;
    }

    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0){
            result = 17; // Arbitrary number.
            result = 31 * result + areaCode;
            result = 31 * result + prefix; // 31 is an odd prime
            result = 31 * result + lineNum;
            hashCode = result;
        }
        return hashCode;
    }

    @Override
    public String toString() {

        return String.format("(%03d) %03d-%04d",areaCode, prefix, lineNum);
    }


}
