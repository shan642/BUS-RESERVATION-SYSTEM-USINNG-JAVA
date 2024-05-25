package busresevation;
import java.util.Scanner;
import java.util.ArrayList;
public class Bus_Reservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Bus> buses = new ArrayList<Bus>();
        ArrayList<Booking> bookings=new ArrayList<Booking>();
        buses.add(new Bus(1,true,2));
        buses.add(new Bus(2,false,55));
        buses.add(new Bus(3,true,35));
       for (Bus bus : buses) {
           bus.displayBusinfo();
       }

        int user_opt=1;
        while (user_opt==1) {
            System.out.println("Enter 1 to book and 2 to exit ");
            user_opt=sc.nextInt();
            if (user_opt==1)
            {
                Booking b1=new Booking();
                if (b1.isavalable(bookings,buses))
                {
                    bookings.add(b1);
                    System.out.println("booking is over");
                }
                else
                {
                    System.out.println("sorry ,booking is already over");
                }
            }
        }
    }
}
