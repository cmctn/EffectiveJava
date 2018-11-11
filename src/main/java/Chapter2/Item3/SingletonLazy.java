package Chapter2.Item3;

public class SingletonLazy {

    private static SingletonLazy INSTANCE = null;

    private SingletonLazy() {}

    public static SingletonLazy getInstance() {
        if (INSTANCE == null) {
            synchronized (SingletonLazy.class) {
                if (INSTANCE == null) {
                    INSTANCE = new SingletonLazy();
                }
            }
        }
        return INSTANCE;
    }

    public void printLazy(){
        System.out.println("hi");
    }

}
