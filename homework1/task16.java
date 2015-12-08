package homework1;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class task16 {

	public static void main(String[] args) {
		// Задача 16:
		// Въведено е трицифрено естествено число от вида abc.
		// Трябва да се провери дали:
		// ако a = b = c - Изход: цифрите са равни;
		// ако a>b>c - Изход: цифрите са във възходящ ред;
		// ако a<b<c цифрите са в низходящ ред;
		// и изход: цифрите са ненаредени, за неописаните случаи.
		// Да се състави програма, която извежда резултата от проверката за
		// наредба на цифрите в числото.
		// Пример: 345
		// Изход: възходящ ред.
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете трицифрено число:");
		int num = sc.nextInt();
		if (((num < 100) && (num > 999))) {
			System.out.println("Invalid number !");
		}
		if((num >= 100) && (num <= 999)){
			int num1 = ((num / 100) % 10);
			int num2 = (num % 100) / 10;
			int num3 = num % 10;
			if (((num1 == num2) && (num2 == num3)) || ((num1 > num2) && (num2 > num3))
					|| ((num1 < num2) && (num2 < num3))) {
				System.out.println("Цифрите са ненаредени!");
			} else {
				if ((num1 == num2) && (num2 == num3)) {
					System.out.println("Цифрите са равни!");
				}
				if ((num1 > num2) && (num2 > num3)) {
					System.out.println(" Цифрите са в низходящ ред!");
				}
				if ((num1 < num2) && (num2 < num3)) {
					System.out.println("Цифрите са във възходящ ред!");
				}
			}
		}

	}
}