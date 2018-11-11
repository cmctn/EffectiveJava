package Chapter6.Item36;

import java.util.HashSet;
import java.util.Set;

public class Bigram {
    private final char first;
    private final char second;

    public Bigram(char first, char second) {
        this.first = first;
        this.second = second;
    }

    // DON'T DO THIS
    public boolean equals(Bigram b) {
        return b.first == first && b.second == second;
    }

//    @Override
//    public boolean equals(Object obj) {
//        if (!(obj instanceof Bigram)){
//            return false;
//        }
//
//        Bigram b = (Bigram) obj;
//        return b.first == first && b.second == second;
//    }

    public int hashCode() {
        return 31 * first + second;
    }

    public static void main(String[] args) {
        Set<Bigram> s = new HashSet<Bigram>();

        // You might expect the program to print 26, as sets cannot contain duplicates. However it prints not 26 but 260.
        // What is wrong? -> Our programmer failed to override equals, overloading it instead
        for (int i = 0; i < 10; i++)
            for (char ch = 'a'; ch <= 'z'; ch++){
                s.add(new Bigram(ch, ch));
            }
        System.out.println(s.size());
    }
}
