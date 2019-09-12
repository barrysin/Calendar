package Calendar;

import java.util.ArrayList;
import java.util.Calendar;
//calendars have events.
public class MyCalendar {

    private ArrayList<Event> events = new ArrayList();


    public MyCalendar(){
    };

    public void addEvent(String name, int year, int month, int day, int hourOfDay, int minute) {
        Event e = new Event(name, year, month, day, hourOfDay, minute);
        events.add(e);
    }

    public ArrayList<Event> getEvents() {
        return events;
    }

    public void removeEvent(String name) {
        int temp = -1;
        int i = 0;
        for (Event e: events) {
            if (name.equals(e.getName())) {
                temp = i;
                i++;
            }
        }
        if (temp >= 0) {
            events.remove(temp);
            System.out.println("Removed event: " + name);
        } else {
            System.out.println(name + " does not exist");
        }
    }
    public void editEvent(String name) {

    }
}
