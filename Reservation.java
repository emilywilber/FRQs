import java.util.ArrayList;
import java.util.Arrays;
/**
 * Holds the guests name and the room number theyre in.
 *
 * @author Emily Wilber
 * @version Jan 24, 2019
 */
public class Reservation
{
    // instance variables - replace the example below with your own
    private String guestName;
    private int roomNumber;
    
    /**
     * Constructor for objects of class Reservation
     */
    public Reservation(String guestName, int roomNumber)
    {
        this.guestName = guestName;
        this.roomNumber = roomNumber;
    }

    /**
     * Returns the room number.
     * @return    the room number
     */
    public int getRoomNumber()
    {
        return roomNumber;
    }
    
    public void showReservation() {
        System.out.println(R.get(guestName) + " " + R.get(roomNumber));
    }
}
