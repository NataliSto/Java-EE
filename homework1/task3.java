package homework1;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
//		Задача 3:
//			Въведете 2 различни числа от конзолата и разменете стойността им.
//			Разпечатайте новите стойности

		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А :");
		double a = sc.nextDouble();
		System.out.println("Въведете B :");
		double b = sc.nextDouble();
		double a1 = b;
		b= a;
		a= a1;
		System.out.println("A = " + a);
		System.out.println("B= " + b);
		
	}

}
