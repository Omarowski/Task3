package Main;

import java.util.ArrayList;
import java.util.Iterator;


public class Main {
    public static void main(String[] args) {
        Week<String> daysOfTheWeek = new Week<>();
        daysOfTheWeek.add("Monday");
        daysOfTheWeek.add("Tuesday");
        daysOfTheWeek.add("Wednesday");
        daysOfTheWeek.add("Thursday");
        daysOfTheWeek.add("Friday");
        daysOfTheWeek.add("Saturday");
        daysOfTheWeek.add("Sunday");

        System.out.println("Iterator in one line");
        System.out.print(daysOfTheWeek);

        System.out.println("");

        System.out.println("Iterator in a column");
        for (Iterator<String> it = daysOfTheWeek.iterator(); it.hasNext(); ){
            System.out.println(it.next());

        }

    }

    public static class Week<T>{

        private ArrayList<T> days;

            public Week(){
                days = new ArrayList<T>();
            }
            public void add(T d){
                days.add(d);

            }

        @Override
        public String toString() {
            return "Weekdays" +
                    " =" + days +"\n"
                    ;
        }

        public class DayIterator<T> implements Iterator<T> {

                private int index = 0;

                @Override
                public boolean hasNext() {
                    return index < days.size();
                }

                @Override
                public T next() {
                    return (T) days.get(index++);
                }

            }

            public Iterator<T> iterator(){
                return new DayIterator<T>();
            }


    }
}


