package Chapter2.Item6;

import java.util.Arrays;
import java.util.EmptyStackException;

public class StackMemoryLeak {

    // Can you spot the "memory leak"?
    private Object[] elements;
    private int size = 0;
    private static final int DEFAULT_INITIAL_CAPACITY = 16;

    public StackMemoryLeak() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;
    }


    // this way causes memory leak
//    public Object pop() {
//        if (size == 0)
//            throw new EmptyStackException();
//        return elements[--size];
//    }

    /**
     * use this pop() to avoid memory leak
     */
    public Object pop() {
        if (size == 0)
            throw new EmptyStackException();
        Object result = elements[--size];
        elements[size] = null; // Eliminate obsolete reference
        return result;
    }



    /**
     * Ensure space for at least one more element, roughly
     * doubling the capacity each time the array needs to grow.
     */
    private void ensureCapacity() {
        if (elements.length == size)
            elements = Arrays.copyOf(elements, 2 * size + 1);
    }

}
