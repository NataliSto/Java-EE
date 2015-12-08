package homework1;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// Задача 9:
		// Да се състави програма, която чете от конзолата 2 естествени
		// двуцифрени числа a,b.
		// Програмата да изведе в конзолата дали последната цифра от
		// произведението на двете числа е четна, както и самата цифра.
		// Входни данни: a,b - естествени числа от интервала [10..99].
		// Пример: 15, 25
		// Изход: 375, 5 нечетна

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А :");
		int a = sc.nextInt();
		System.out.println("Въведете B :");
		int b = sc.nextInt();
		if ((a < 9) && (a > 100) && (b < 9) && (b > 100)) {
			System.out.println("Въвели сте невалидни числа!");
		} else {
			int mult = a * b;

			if (mult % 2 == 0) {
				System.out.println(mult + ", " + mult % 10 + " четна");
			} else {
				System.out.println(mult + ", " + mult % 10 + " нечетна");
			}
		}
	}

}
