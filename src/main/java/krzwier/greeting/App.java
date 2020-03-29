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
        String output = "Hello, ";
        for (int i = 0; i < arr.length - 1; i++){
            output = output + arr[i] + ", ";
        }
        output = output + "and " + arr[arr.length - 1] + ".";
		return output;
	}

}
