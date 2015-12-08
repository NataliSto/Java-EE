package homework5;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете дума: ");
		String word = sc.nextLine();
		for (int index = 0; index < word.length(); index++) {
			char newWord = (char) (word.charAt(index) + 5);
			System.out.print(newWord);
		}
		System.out.println();

	}

}
