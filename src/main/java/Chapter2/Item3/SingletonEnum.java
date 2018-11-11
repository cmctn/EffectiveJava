package Chapter2.Item3;

public enum SingletonEnum {
    INSTANCE;

    int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
}

/**
 *
 * One thing to remember here is,
 * when serializing an enum, field variables are not getting serialized.
 *
 * For example, if we serialize and deserialize the SingletonEnum class,
 * we will lose the value of the int value field
 *
 */
