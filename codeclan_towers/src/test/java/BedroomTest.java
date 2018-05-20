import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    Bedroom bedroom;
    Room room;
    Guest guest;

    @Before
    public void before(){
        bedroom = new Bedroom(2, 90.00);
    }

    @Test
    public void bedroomHasCapacity(){
        assertEquals(2, bedroom.getCapacity());
    }

    @Test
    public void bedroomHasGuests(){
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void removeGuests(){
        bedroom.addGuest(guest);
        bedroom.removeGuest(guest);
        assertEquals(0, bedroom.getNumberOfGuests());
    }

    @Test
    public void hasNightlyRate(){
        assertEquals(90.00, bedroom.getNightlyRate(), 0.01);
    }

}
