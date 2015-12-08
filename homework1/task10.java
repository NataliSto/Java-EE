package homework1;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		// Трябва да се напълни цистерна с вода. Имате 2 кофи с вместимост 2 и
		// 3 литра и ги ползвате едновременно.
		// Да се състави програма, която по даден обем извежда как ще прелеете
		// течността с тези кофи, т.е. по-колко пъти ще се пълни всяка от
		// кофите. Кофите не могат да се ползват с частично количество вода.
		// Входни данни: естествено число от интервала [10..9999].
		// Пример: 107
		// Изход: 21 пъти по 2 литра,
		// 21 пъти по 3 литра
		// допълнително кофа от 2 литра

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете обем на цистерната :");
		int capacity = sc.nextInt();
		int num = capacity / 5;
		int rest = capacity % 5;
		if ((capacity >= 10) && (capacity <= 9999)) {
			if (rest == 0) {
				System.out.println(num + " пъти по 2л,");
				System.out.println(num + " пъти по 3л.");
			} else {
				switch (rest) {
				case 1:
					System.out.println((num - 1) + "пъти по 2л, ");
					System.out.println((num - 1) + "пъти по 3л.");
					System.out.println("Допълнително 2 кофи от 3л.");
					break;
				case 2:
					System.out.println((num) + "пъти по 2л, ");
					System.out.println((num) + "пъти по 3л.");
					System.out.println("Допълнително кофа от 2л.");
					break;
				case 3:
					System.out.println((num) + "пъти по 2л, ");
					System.out.println((num) + "пъти по 3л.");
					System.out.println("Допълнително кофа от 3л.");
					break;
				case 4:
					System.out.println((num) + "пъти по 2л, ");
					System.out.println((num) + "пъти по 3л.");
					System.out.println("2 допълнителни кофи от 2л.");
					break;
				}
			}
		} else {
			System.out.println("Въвели сте некоректен обем на цистерната");
		}

	}

}
