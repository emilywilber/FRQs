import java.util.ArrayList;
import java.util.Arrays;
/**
 * Write a description of class Hotel here.
 *
 * @author Emily Wilber
 * @version Jan 24, 2019
 */
public class Hotel
{
    /**
     * Each element corresponds to a room in the hotel;
     * if rooms[index] is null, the room is empty;
     * otherwise, it contains a reference to the Reservation
     * for that room, such that
     * rooms[index].getRoomNumber() returns index
     */
    private Reservation[] rooms;
    
    /** 
     * Contains names of guest who have not yet een
     * assigned a room because all rooms are full
     */
    private ArrayList<String> waitList;
    
    public Hotel(int numRooms) {
        this.rooms = new Reservation[numRooms];
        this.waitList = new ArrayList<String>();
    }

    /**
     * If there are any empty rooms (rooms w/o a reservation),
     * then create a reservation for an empty room for the 
     * specified guest and return the new Reservation;
     * otherswise, add the guest to the end of waitList
     * and return null
     */
    public Reservation requestRoom(String guestName)
    {
        for (int i = 0; i < rooms.length; i++) {
            if (rooms[i] == null) {
                Reservation R = new Reservation(guestName, i);
                rooms[i] = R;
                return R.showReservation();
            }
        }
        waitList.add(guestName);
        return null;
    }

    /**
     * Release the room associated with parameter res, effectively
     * canceling the reservation;
     * 
     * if any name are stored in waitList, remove the first name and create 
     * a Reservation for this person in the room reserved by res; 
     * return that new Reservation;
     * 
     * if waitList is empty mark the room specified by res as empty and 
     * return null
     * 
     * precondition:    res is a valid Reseration for some room
     *                  in this hotel
     */
    public Reservation cancelAndReassign(Reservation res)
    {
        int openRoom = res.getRoomNumber();
        rooms[openRoom] = null;
        
        if (waitList.size() > 0) {
            String waiter = waitList.get(0);
            Reservation R = new Reservation(waiter, openRoom);
            rooms[openRoom] = R;
            return R.showReservation();
        }
        else {
            rooms[openRoom] = null;
            return null;
        }
    }
    
    public Reservation[] getRooms() {
        return rooms;   
    }
    
    public String toString() {
        return Arrays.toString(rooms) + "\n" + waitList;
    }
}

