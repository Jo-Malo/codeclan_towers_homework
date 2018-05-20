import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceRoom;
    Guest guest;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom(20, "Jacobite", 100.00);
    }

    @Test
    public void conferenceRoomHasName(){
        assertEquals("Jacobite", conferenceRoom.getName());
    }

    @Test
    public void conferenceRoomHasCapacity(){
        assertEquals(20, conferenceRoom.getCapacity());
    }

    @Test
    public void conferenceRoomHasGuests(){
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void removeGuests(){
        conferenceRoom.addGuest(guest);
        conferenceRoom.removeGuest(guest);
        assertEquals(0, conferenceRoom.getNumberOfGuests());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(100.00, conferenceRoom.getDailyRate(), 0.01);
    }
}


