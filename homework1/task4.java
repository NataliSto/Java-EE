package homework1;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
//		Задача 4:
//		Въведете 2 различни числа от конзолата и ги разпечатайте в
//		нарастващ ред.
		Scanner sc = new Scanner(System.in);
		System.out.println("Въведете А :");
		int a = sc.nextInt();
		System.out.println("Въведете B :");
		int b = sc.nextInt();
		if(a>b){
			System.out.println( b+ " " + a);
		}else{
			System.out.println(a + " " + b);
		}


	}

}
