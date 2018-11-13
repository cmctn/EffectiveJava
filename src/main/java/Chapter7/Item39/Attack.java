package Chapter7.Item39;

import java.util.Date;

public class Attack {
    public static void main(String[] args) {
        // Attack on the internals of a Period instance
        Date start = new Date();
        Date end = new Date();
        Period p = new Period(start, end);
        end.setYear(78); // Modifies internals of p!
        System.out.println(p);

        // Second attack on the internals of a Period instance
        start = new Date();
        end = new Date();
        p = new Period(start, end);
        p.end().setYear(78); // Modifies internals of p!
        System.out.println(p);
    }
}
