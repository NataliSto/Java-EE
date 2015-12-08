package homework5;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Въведете първия низ: ");
		String s1 = sc.nextLine();
		
			String[] s2 = s1.split(" ");
			
			for (int i = 0; i < s2.length; i++) {
				System.out.print(s2[i].toUpperCase().charAt(0) 
						+ s2[i].substring(1, s2[i].length()) + " ");
			}
	}

}
