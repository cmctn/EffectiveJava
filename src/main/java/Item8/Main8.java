package Item8;

public class Main8 {


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