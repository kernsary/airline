import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;

public class PlaneTest {

    private Plane plane1;

    @Before
    public void setup() {
        plane1 = new Plane(PlaneType.BOEING747);
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, plane1.getPlaneTypeCapacity());
    }

    @Test
    public void hasWeight(){
        assertEquals(8, plane1.getPlaneTypeWeight());
    }
}
