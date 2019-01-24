import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class HotelTester here.
 *
 * @author Emily Wilber
 * @version Jan 24, 2019
 */
public class HotelTester {
    public static void main(String[] args) {
                
        Hotel hotel = new Hotel(3);
        
        System.out.println(hotel);
        
        System.out.println( hotel.requestRoom("a") );
        System.out.println( hotel.requestRoom("b") );
        System.out.println( hotel.requestRoom("c") );
        System.out.println( hotel.requestRoom("d") );
        System.out.println( hotel.requestRoom("e") );

        System.out.println(hotel);
        
        Reservation[] reservations = hotel.getRooms();
        
        System.out.println( hotel.cancelAndReassign(reservations[0]) );
        System.out.println( hotel.cancelAndReassign(reservations[2]) );
        System.out.println(hotel);
    }
}
