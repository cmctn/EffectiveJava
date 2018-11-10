package Chapter2.Item9;

import java.util.Objects;

public class UseObjectsHashCode {

    private String name;
    private int age;
    private String passport;

    public UseObjectsHashCode(String name, int age, String passport) {
        this.name = name;
        this.age = age;
        this.passport = passport;
    }


    @Override
    public boolean equals(Object o) {

        if (o == this) return true;
        if (!(o instanceof UseObjectsHashCode)) {
            return false;
        }
        UseObjectsHashCode user = (UseObjectsHashCode) o;
        return Objects.equals(age,user.age) &&
                Objects.equals(name, user.name) &&
                Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, passport);
    }
}
