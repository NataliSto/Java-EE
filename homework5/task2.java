package homework5;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете първата дума: ");
		String s1 = sc.nextLine();
		System.out.print("Въведете втората дума: ");
		String s2 = sc.nextLine();
		if (!(s1.length() >= 10 && s1.length() <= 20 && s2.length() >= 10 && s2.length() <= 20)) {
			System.out.println("Въвели сте думи с некоректна дължина ");
		} else {

			String s3 = s2.substring(0, 5) + s1.substring(5, s1.length());
			String s4 = s1.substring(0, 5) + s2.substring(5, s2.length());

			if (s2.length() > s1.length()) {
				System.out.println(s2.length() + " " + s4);
			}
			if (s2.length() == s1.length()) {
				System.out.println("Дължините на двете думи са равни " + s1.length() + " " + " " + s3 + " " + s4);
			}
			if (s2.length() < s1.length()) {
				System.out.println(s1.length() + " " + s3);
			}

		}
	}
}
