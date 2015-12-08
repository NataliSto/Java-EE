package homework5;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете първата дума: ");
		String s1 = sc.nextLine();
		System.out.print("Въведете втората дума: ");
		String s2 = sc.nextLine();

		int count = 0;
		if (s1.length() == s2.length()) {
			System.out.println("Двата низа са с равна дължина.");

			System.out.println("Разлика по позиции:");
			for (int index1 = 0, index2 = 0; index1 <= s1.length() - 1
					&& index2 <= s2.length() - 1; index1++, index2++) {
				count++;
				char symbol1 = s1.charAt(index1);
				char symbol2 = s2.charAt(index2);

				if (!(symbol1 == symbol2)) {

					System.out.println(count + " " + symbol1 + "-" + symbol2);

				}
			}
		} else {
			System.out.println("Двата низа са с различна дължина");
		}
	}

}
