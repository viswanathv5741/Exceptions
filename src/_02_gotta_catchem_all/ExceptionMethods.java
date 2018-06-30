package _02_gotta_catchem_all;

import static org.junit.Assert.fail;

public class ExceptionMethods {
	public static double divide(double x, double y) {
		if (y == 0.0) {
			throw new IllegalArgumentException();
		}
		return x/y;
	}
	
	public static String reverseString(String x) {
		if (x.length() == 0) {
			throw new IllegalStateException();
		}
		else {
			String reversed = "";
			for (int j = x.length()-1; j>=0; j--) {
				reversed += x.charAt(j);
			}
			return reversed;
		}
	}
}
