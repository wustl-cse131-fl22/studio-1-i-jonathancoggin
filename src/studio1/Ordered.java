package studio1;

import java.util.Scanner;

public class Ordered {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Value for x?");
		int x = in.nextInt();
		System.out.println("Value for y?");
		int y = in.nextInt();
		System.out.println("Value for z?");
		int z = in.nextInt();
		
		// Booleans that determine whether the order is correct
		boolean xGreaterY = (x - y) < 0;
		boolean yGreaterZ = (y - z) < 0;
		
		
		// Assesses whether the whole statement is ordered
		boolean isOrdered = xGreaterY && yGreaterZ;
		
		System.out.println(isOrdered);

	}

}
