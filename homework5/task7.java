package homework5;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете набор от думи разделени с интервал: ");
		String s1 = sc.nextLine();

		String[] s2 = s1.split(" ");
		int count = 0;
		int word = 0;
		for (int i = 0; i < s2.length; i++) {
			count++;

			if (count < s2[i].length()) {
				word = s2[i].length();
			}
		}

		System.out.print(count + " думи, най-дългата е " + word + " символа.");
	}
}
