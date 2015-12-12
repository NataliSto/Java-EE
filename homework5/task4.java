package homework5;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете двете имена: ");
		String s1 = sc.nextLine();
		int count = 0;

		for (int index = 0; index < s1.length() - 1; index++) {
			count++;
			if (s1.charAt(index) == ',') {

				if (count > (s1.length() - count)) {
					System.out.print((s1.substring(0, count - 1)));
				} else {
					System.out.print(s1.substring(count, s1.length()));
				}
			}
		}

	}
}
