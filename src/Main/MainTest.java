package Main;


import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Iterator;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {
        Main.Week<String> daysOfTheWeek;

    @BeforeEach
    void days() {
        daysOfTheWeek = new Main.Week<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

    }


    @Test
    public void iteratorInstance() {
        Iterator<String> actual = daysOfTheWeek.iterator();
        assertTrue(actual instanceof Main.Week.DayIterator);
    }
    @Test
    public void nextItem() {

        Iterator<String> actual = daysOfTheWeek.iterator();

        String nextItem = actual.next();
        assertEquals("Monday", nextItem);
        String nextItem2 = actual.next();
        assertEquals("Tuesday", nextItem2);
    }
    @Test
    public void checkLoop() {

        String[] days = {"Monday",
        "Tuesday",
        "Wednesday",
        "Thursday",
        "Friday",
        "Saturday",
        "Sunday"};

        Iterator<String> it = daysOfTheWeek.iterator();
        for (int i = 0; i < days.length; i++) {
            assertEquals(days[i], it.next());
        }
    }
    @Test
    public void hashNextItem() {
        String[] days = {"Monday",
                "Tuesday",
                "Wednesday",
                "Thursday",
                "Friday",
                "Saturday",
                "Sunday"};
        Iterator<String> actual = daysOfTheWeek.iterator();

        assertTrue(actual.hasNext(),days.toString() );

    }

}