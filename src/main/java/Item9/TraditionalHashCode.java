package Item9;


public class TraditionalHashCode {

    private volatile int hashCode;

    private String name;
    private int age;
    private String passport;

    public TraditionalHashCode(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }


    @Override
    public int hashCode() {
        int result = hashCode;
        if(result == 0){
            result = 17; // Aribtrary number.
            result = 31 * result + name.hashCode();
            result = 31 * result + age; // 31 is an odd prime
            result = 31 * result + passport.hashCode();
            hashCode = result;
        }
        return hashCode;
    }


}
