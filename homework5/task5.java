package homework5;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Въведете първия низ: ");
		String s1 = sc.nextLine();
		System.out.print("Въведете втория низ: ");
		String s2 = sc.nextLine();
		int count = 1;
		for (int i1 = 1; i1 < s1.length() - 1; i1++) {
			count++;

			if (s1.charAt(i1) == s2.charAt(0)) {

				for (int index = 0; index < count - 1; index++) {

					System.out.println(s1.charAt(index));
				}
				System.out.println(s2);
				for (int index = count; index < s1.length(); index++) {
					System.out.println(s1.charAt(index));
				}

				
			}

		}
	}
}
