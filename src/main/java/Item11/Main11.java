package Item11;

import Item10.PhoneNumber;

public class Main11 {

    public static void main(String[] args) {

        // Assertion error !!!!!!
        //PhoneNumber phoneNumber = new PhoneNumber(216,355,2134);
        //phoneNumber.clone();





        // HashTable
        HashTable cloningSample = new HashTable();
        System.out.println(cloningSample.toString());


        System.out.println(cloningSample.clone().toString());




    }

}
