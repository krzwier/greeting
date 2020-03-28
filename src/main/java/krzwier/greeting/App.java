package krzwier.greeting;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
    }

	public static String greet(String name) {
        if (name == null) {
            return "Hello, my friend.";
        } else {
            return "Hello, " + name + ".";
        }
		
	}

}
