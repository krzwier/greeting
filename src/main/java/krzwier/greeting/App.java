package krzwier.greeting;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String greet(String name) {
        if (name == null) {
            return "Hello, my friend.";
        } else if (name.equals(name.toUpperCase())){
            return "HELLO " + name + "!";
        } else {
            return "Hello, " + name + ".";
        }
		
	}

	public static String greet(String[] arr) {
		return "Hello, " + arr[0] + " and " + arr[1] + ".";
	}

}
