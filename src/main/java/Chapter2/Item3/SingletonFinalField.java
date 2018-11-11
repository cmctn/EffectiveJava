package Chapter2.Item3;

public class SingletonFinalField {

    // Singleton With Public Static Final Field
    public static final SingletonFinalField INSTANCE = new SingletonFinalField();

    private SingletonFinalField() {}


    // cem


    //  called when preparing the deserialized object before returning it to the caller.
//    protected Object readResolve() {
//        return INSTANCE;
//    }


    public void print(){
        System.out.println("hello");
    }

}
