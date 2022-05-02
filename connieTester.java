import static org.junit.Assert.*;
import org.junit.*;

public class connieTester {
    @Test
    public void testPositiveNum() {
        connie test1 = new connie();
        assertEquals(5,test1.positiveNumber());
    }  
}

