package homework1;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		// Задача 14:
		// Да се състави програма, която по въведени координати на 2 позиции
		// от шахматната дъска извежда отговор дали са оцветени в еднакъв или
		// различен цвят.
		// Шахматната дъска е квадратна.
		// Въвеждат се две двойки числа от интервала [1..8].
		// Пример: 2 2 3 2
		// Изход: Позициите са с различен цвят

		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете  х1 :");
		int x1 = sc.nextInt();
		System.out.print("Въведете  х2 :");
		int x2 = sc.nextInt();
		System.out.print("Въведете  y1 :");
		int y1 = sc.nextInt();
		System.out.print("Въведете  y2 :");
		int y2 = sc.nextInt();
		boolean x11 = ((x1 >= 1) && (x1 <= 8));
		boolean y11 = ((y1 >= 1) && (y1 <= 8));
		boolean x21 = ((x2 >= 1) && (x2 <= 8));
		boolean y21 = ((y2 >= 1) && (y2 <= 8));
		if (!(x11 && x21 && y11 && y21)) {
			System.out.println("Невалидни координати!");
		} else {
			boolean x12 = (x1 % 2 == 0);
			boolean x22 = (x2 % 2 == 0);
			boolean y12 = (y1 % 2 == 0);
			boolean y22 = (y2 % 2 == 0);
			if ((x12 && x22 && y12 && y22)||(!(x12 && x22 && y12 && y22)) ){
				System.out.println(" Еднакъв цвят");
			} else {
				System.out.println("Различен цвят");
			}
		}
	}
}

