package homework1;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
//		"Задача 2:
//			Въведете 2 различни целочислени числа от конзолата. Запишете
//			тяхната сума, разлика, произведение, остатък от деление и
//			целочислено деление в отделни променливи и разпечатайте тези
//			резултати в конзолата. Опитайте същото с числа с плаваща запетая."
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А :");
		double a = sc.nextDouble();
		System.out.println("Въведете B :");
		double b = sc.nextDouble();
		double sum= a+b;
		double substraction = a-b;
		double multiplication = a*b;
		double div = a/b;
		double restOfDivision = a%b;
		
		System.out.println( " A + B = " + sum);
	System.out.println( " A * B = " + multiplication);
		System.out.println( " A - B = " + substraction);
		System.out.println( " A / B = " + div);
		System.out.println( " A % B = " + restOfDivision);
	}

}
