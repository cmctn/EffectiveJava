package Item8;

public class TraditionalWay {
    // Traditional way before Java 7

    private String name;
    private int age;
    private String passport;


    public TraditionalWay(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof TraditionalWay)) {
            return false;
        }

        TraditionalWay user = (TraditionalWay) o;

        return user.name.equals(name) &&
                user.age == age &&
                user.passport.equals(passport);
    }


}
