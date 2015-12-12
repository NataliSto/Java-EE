package homework5;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете първия низ: ");
		String s1 = sc.nextLine();
		System.out.print("Въведете втория низ: ");
		String s2 = sc.nextLine();
		if (s1.length() + s2.length() > 40) {
			System.out.println("Въведените низове са с дължина по-голяма от 40 символа");
		} else {

			System.out.println(
					s1.toUpperCase() + " " + s1.toLowerCase() + " " + s2.toUpperCase() + " " + s2.toLowerCase());
		}
	}
}
