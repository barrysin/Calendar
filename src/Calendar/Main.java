package Calendar;

import java.util.ArrayList;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        MyCalendar calendar = new MyCalendar();
        calendar.addEvent("Party", 2019, 9, 9, 20, 30);
        ArrayList<Event> events = calendar.getEvents();
        for (Event e: events) {
            System.out.println(e.getEventDate());
        }
        calendar.removeEvent("Party");
        calendar.removeEvent("Partys");

    }
}
