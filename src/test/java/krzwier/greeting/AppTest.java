package krzwier.greeting;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

/**
 * Unit tests for App.
 */
public class AppTest 
{
    /**
     * Test for requirement #1
     * Method greet(name) must interpolate name into greeting.
     */
    @Test
    public void testGreetingBob(){
        String bob = "Bob";
        assertEquals("Hello, Bob.", App.greet(bob));
    
    }

    /**
     * Test for requirement #2
     * Method greet(name) must handle nulls by returning "Hello, my friend."
     */
    @Test
    public void testGreetingNull(){
        String nullString = null;
        assertEquals("Hello, my friend.", App.greet(nullString));
    }

    /**
     * Test for requirement #3
     * Method greet(name) must handle shouting.
     */
    @Test
    public void testGreetingShout(){
        String shout = "JERRY";
        assertEquals("HELLO JERRY!", App.greet(shout));
    }

    /**
     * Test for requirement #4
     * Method greet(name) must also accept an array of two names
     */
    @Test
    public void testGreetingArrayTwo(){
        String[] arr = {"Jill", "Jane"};
        assertEquals("Hello, Jill and Jane.",App.greet(arr));
    }
}
