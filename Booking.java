package busresevation;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.text.DateFormat;

public class Booking {
    int busno;
    String passenger_name;
    Date date;

    Booking()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER YOUR NAME: ");
        passenger_name=sc.nextLine();
        System.out.println("ENTER YOUR BUS NUMBER: ");
        busno=sc.nextInt();
        System.out.println("ENTER YOUR DATE: ");
        String dateinput=sc.next();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        try {
            date=dateFormat.parse(dateinput);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }

    }
    public boolean isavalable(ArrayList<Booking> bookings,ArrayList<Bus> buses)
    {
        int capacity=0;
        for (Bus bus : buses)
        {
            if (bus.getBus_no()==busno)
            {
                capacity=bus.getCapacity();
            }
        }
        int booked=0;
        for (Booking booking : bookings)
        {
            if (booking.busno==busno && booking.date.equals(date)){
                booked++;
            }
        }
        return booked < capacity;
    }
}
