package homework1;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// Задача 6:
		// Въведете 3 числа от клавиатурата а1, а2 и а3. Разменете стойностите
		// им така, че а1 да има стойността на а2, а2 да има стойността на а3, а
		// а3 да има старата стойност на а1.
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А1 :");
		int a1 = sc.nextInt();
		System.out.println("Въведете A2 :");
		int a2 = sc.nextInt();
		System.out.println("Въведете A3 :");
		int a3 = sc.nextInt();
		int n = a1;
		a1 = a2;
		a2 = a3;
		a3 = n;
		System.out.println("A1 = " + a1);
		System.out.println("A2 = " + a2);
		System.out.println("A3 = " + a3);

	}

}
