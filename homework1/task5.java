package homework1;

import java.util.Scanner;

public class task5 {

	public static void main(String[] args) {
//		������ 5:
//			�������� 3 �������� ����� �� ��������� � �� ������������ � ��������
//			���.

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� � :");
		int a = sc.nextInt();
		System.out.println("�������� B :");
		int b = sc.nextInt();
		System.out.println("�������� C :");
		int c = sc.nextInt();
		boolean ab = a < b;
		boolean ba = a > b;
		boolean ac = a < c;
		boolean ca = a > c;
		boolean cb = c < b;
		boolean bc = b < c;
		if (ab) {
			if (bc) {
				System.out.println(c + " " + b + " " + a);
			} else {
				if (ca) {
					System.out.println(b + " " + a + " " + c);
				} else {
					System.out.println(b + " " + c + " " + a);
				}
			}
		} else {
			if (cb) {
				System.out.println(a + " " + b + " " + c);
			} else {
				if (ac) {
					System.out.println(c + " " + a + " " + b);
				} else {
					System.out.println(a + " " + c + " " + b);
				}

			}
		}
	}

}
