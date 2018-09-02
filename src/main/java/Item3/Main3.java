package Item3;

public class Main3 {


    public static void main(String[] args) {

        // 1 final field
        SingletonFinalField.getINSTANCE().print();

        // 2 static factory method
        SingletonStaticFactoryMethod.getInstance().printIt();

        // 3 lazy initialization
        SingletonLazy.getInstance().printLazy();
        // the instance is created when we access the singleton object for the first time. - LAZY


        // disadvantages of first 3 methods :
        // When deserializing a class, new instances are created. Now it doesn't matter the constructor is private or not.


        // 4 enum
        SingletonEnum singleton = SingletonEnum.INSTANCE;
        System.out.println(singleton.getValue());
        singleton.setValue(2);
        System.out.println(singleton.getValue());


    }

}
