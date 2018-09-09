package Item9;


/**
 * A hashcode is a number generated from any object.
 * This is what allows objects to be stored/retrieved quickly in a Hashtable.
 */
public class Main9 {

    public static void main(String[] args) {


    // muhittin topalak, from kazlicesme
    TraditionalHashCode user = new TraditionalHashCode("Muhittin",34,"TR");
    TraditionalHashCode user2 = new TraditionalHashCode("Bahattin",23,"TR");

    System.out.println(user.hashCode());
    System.out.println(user2.hashCode());

    System.out.println(user.hashCode());

    System.out.println("---------------------------");

    // use objects
    UseObjectsHashCode newUser = new UseObjectsHashCode("Pablo",26,"ES");
    // Salvador Domingo Felipe Jacinto Dalí i Domènech = abi saygilar
    UseObjectsHashCode newUser2 = new UseObjectsHashCode("Salvador",29,"ES");


    System.out.println(newUser.hashCode());
    System.out.println(newUser2.hashCode());

    System.out.println(newUser.hashCode());





    }


}
