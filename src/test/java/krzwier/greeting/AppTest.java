package krzwier.greeting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void testGreetingBob()
    {
        String bob = "Bob";
        assertEquals("Hello, Bob.", App.greet(bob));
    
    }
}
