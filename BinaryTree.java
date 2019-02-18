package lab;

/**
 * author 
 * Dara Gilbert
 */

import java.util.Scanner;

public class BinaryTree {
	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		int[] array = new int[256];
		for (int i = 0; i < array.length; i++) {
			array[i] = 0;
		}

		String s = scan.nextLine();
		String binaries = "";
		for (int i = 0; i < s.length(); i++) {
			String currentChar = "";
			currentChar += s.charAt(i);
			int pos = ((int) currentChar.charAt(0));
			binaries += padding(Integer.toBinaryString(pos)) + " ";
			array[pos]++;

		}
		System.out.println(binaries);

		for (int i = 0; i < array.length; i++) {
			if (array[i] > 1) {
				System.out.println("'" + (char) i + "'" + " appeared " + array[i] + " times");
			} else if (array[i] == 1) {
				System.out.println("'" + (char) i + "'" + " appeared " + array[i] + " time");
			}
		}
		scan.close();
	}

	// Pads out the binary String if the binary number is less than 8
	public static String padding(String s) {
		int padding = 8 - s.length();
		String res = "";
		for (int i = 0; i < padding; i++) {
			res += 0;
		}
		res += s;
		return res;
	}
}
