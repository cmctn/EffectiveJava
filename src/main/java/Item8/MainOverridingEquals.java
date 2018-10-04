package Item8;

public class MainOverridingEquals {

    /**
     * the contract
     * ------------
     * for any non-null references x,y,z
     *
     * reflexive : x.equals(x) must return true.
     * symmetric : x.equals(y) return true, if only and if y.equals(x) returns true.
     * transitive : if x.equals(y) returns true, and y.equals(z) returns true
     *              then x.equals(z) must return true.
     * consistent : multiple invocations of x.equals(y) consistently return true or
     *              consistenly return false.
     * non-nullity(Joshua) :
     */


    public static void main(String[] args) {

        TraditionalWay user = new TraditionalWay("John",32,"US");
        TraditionalWay user2 = new TraditionalWay("Mary", 32, "US");
        TraditionalWay userCoincidence= new TraditionalWay("John",32,"US");

        System.out.println(user.equals(user2));
        System.out.println(user.equals(userCoincidence));


        // use Objects ...
        UseObjects newUser = new UseObjects("Ivan",28,"RU");
        UseObjects newUser2 = new UseObjects("Ivan",29,"RU");

        System.out.println(newUser.equals(newUser2));


    }




}