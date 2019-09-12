package Calendar;

import java.util.Calendar;
import java.util.Date;

//events have dates.
public class Event {

    private String name;
    private Calendar date = Calendar.getInstance();

    public Event(String name, int month, int day, int hourOfDay, int minute){
        this.name = name;
        date.set(2019, month, day, hourOfDay, minute, 0);
    }

    public Event(String name, int year, int month, int day, int hourOfDay, int minute){
        this.name = name;
        date.set(year, month, day, hourOfDay, minute, 0);
    }

    public Date getEventDate() {
        return date.getTime();
    }

    public String getName() {
        return name;
    }
    public void editEventDate() {
    }
}
