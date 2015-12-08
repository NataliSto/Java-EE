package homework1;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		// Задача 15:
		// Да се състави програма, която въвежда естествено число от интервала
		// [0..24].
		// Програмата да изведе съответстващо съобщение съобразно въведения
		// час.
		// Периодите са:
		// [18..4] - Добър вечер;
		// [4..9] - Добро утро;
		// [9..18] - Добър ден
		// Пример: 10
		// Изход: Добър ден

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час:");
		int hour = sc.nextInt();
		if ((hour < 0) || (hour > 24)) {
			System.out.println("Invalid hour ");
		} else {
			if (((hour >= 18) && (hour < 24)) || ((hour >= 0) && (hour < 4))) {
				System.out.println("Добър вечер!");
			}
			if ((hour >= 4) && (hour < 9)) {
				System.out.println("Добро утро!");
			}
			if ((hour >= 9) && (hour < 18)) {
				System.out.println("Добър ден!");

			}
		}
	}

}
