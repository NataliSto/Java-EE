package homework1;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		// Задача 11:
		// Съставете програма, която по дадено трицифренo число проверява
		// дали числото се дели на всяка своя цифра. Във въведеното число да
		// няма цифра 0.
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете число :");
		int a = sc.nextInt();
		if (!(a >= 100) && (a <= 999)) {
			System.out.println("Въвели сте невалидно число");
		} else {
			int num1 = (a % 10);
			int num2 = ((a / 10)%10 );
			
			int num3 = ((a % 100) / 10);
			if ((num1 == 0) ||(num2 == 0) ||(num3 == 0)) {
				System.out.println("някоя от цифрите образуващи числото е равна на 0");
			} else {
				if ((a % num1 == 0) && (a % num2 == 0) && (a % num3 == 0)) {
					System.out.println("Числото се дели на всяка своя цифра.");
				} else {
					System.out.println("Числото не се дели на всяка своя цифра.");
				}
			}
		}

	}

}
