package homework1;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// Задача 7:
		// Въведете 3 променливи от клавиатурата – час (целочислен тип), сума
		// пари (число с плаваща запетая), дали съм здрав – булев тип.
		// Съставете програма, която взема решения на базата на тези данни по
		// следния начин:
		// - ако съм болен, няма да излизам
		// - ако имам пари, ще си купя лекарства
		// - ако нямам – ще стоя вкъщи и ще пия чай
		// - ако съм здрав, ще отида на кино с приятели
		// - ако имам по-малко от 10 лв, ще отида на кафе.
		// Полученото решение покажете като съобщение в конзолата.

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете час: ");
		int hour = sc.nextInt();
		System.out.println("Въведете сума пари: ");
		float monay = sc.nextFloat();
		System.out.println("Болен ли си? ");
		boolean sick = sc.nextBoolean();

		System.out.println("Часът е : " + hour);
		boolean monay1 = monay >= 10;
		boolean monay3 = monay > 0;
		boolean sick1 = sick;
		boolean sick2 = !sick;
		if (sick1) {
			System.out.println("Болен съм.");
			if (monay3) {
				System.out.println("Ще си купя лекарства.");
			} else {
				System.out.println("Ще си стоя в къщи и ще пия чай.");
			}
		} else {
			System.out.println("Аз съм здрав.");
			if (monay1) {
				System.out.println("Отивам на кино с приятели.");
			} else {
				System.out.println("Ще отида на кафе.");
			}
		}
	}

}
