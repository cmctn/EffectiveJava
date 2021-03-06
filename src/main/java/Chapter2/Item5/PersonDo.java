package Chapter2.Item5;

import java.util.Calendar;
import java.util.TimeZone;
import java.util.Date;


public class PersonDo {

    // we can also reuse mutable objects, if we know they wont be modified
    private Date birthDate;   // ??? final


    public PersonDo(Date birthDate) {
        // Defensive copy - see Item 39
        this.birthDate = new Date(birthDate.getTime());
    }
    /**
     * this version avoids this enffiency with a static initializer.
     */
    private static final Date BOOM_START;
    private static final Date BOOM_END;
    static {
        Calendar gmtCal = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        gmtCal.set(1946, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_START = gmtCal.getTime();

        gmtCal.set(1965, Calendar.JANUARY, 1, 0, 0, 0);
        BOOM_END = gmtCal.getTime();
    }

    public boolean isBabyBoomer() {
        return birthDate.compareTo(BOOM_START) >= 0 && birthDate.compareTo(BOOM_END) < 0;
    }


}
