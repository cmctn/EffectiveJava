package Item3;

public class SingletonStaticFactoryMethod {

    private static final SingletonStaticFactoryMethod INSTANCE = new SingletonStaticFactoryMethod();

    private SingletonStaticFactoryMethod() {}

    public static SingletonStaticFactoryMethod getInstance(){
        return INSTANCE;
    }

    // you can make the class a non-singleton without changing the API.
//    public static SingletonStaticFactoryMethod getInstance() {
//        return new SingletonStaticFactoryMethod ();
//    }

    public void printIt(){
        System.out.println("hello again");
    }


}
