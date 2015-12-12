package homework5;

import java.util.Scanner;

public class таск8 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дума: ");
		String s1 = sc.nextLine();
		int length = s1.length();
		boolean specular = false;

		for (int index = 0; index < (length / 2 - 1); index++) {
			if (s1.charAt(index) == s1.charAt(length - 1)) {
				specular = true;
				length--;
				continue;
			} else {
				specular = false;
				break;

			}
		}
		if (s1.charAt(length - 1) == 1) {
			specular = true;
		}
		System.out.println("Думата палиндром ли е? " + specular);
	}
}
