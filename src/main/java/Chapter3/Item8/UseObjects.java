package Chapter2.Item8;

import java.util.Objects;

public class UseObjects {

    // For Java 7 and above
    // we can use Objects to generate the equals and hashCode values

    private String name;
    private int age;
    private String passport;

    public UseObjects(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof UseObjects)) {
            return false;
        }
        UseObjects user = (UseObjects) o;

        // !!!!!
        return Objects.equals(age, user.age) &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }


}
