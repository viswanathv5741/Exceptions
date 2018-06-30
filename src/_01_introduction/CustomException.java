package _01_introduction;

public class CustomException extends Exception{
	public static void terminate() {
		System.out.println("Terminating through CustomException");
		System.exit(0);
	}
}
