package homework1;

import java.util.Scanner;

public class task1 {

	public static void main(String[] args) {
//		������ 1:
//			�� �� ������� ��������� ��� ����������� � �� �� �������� 2 ����� ��
//			������������ A � B (���� �� �� � ������� ������� � double).
//			����� �� �� ������� 3-�� ����� C � �� �� ������� ���� �� � �/� A � B.
//			�� �� ������ ��������� ��������� �� ���� ���� C � ����� A � B.

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� � :");
		double a = sc.nextDouble();
		System.out.println("�������� B :");
		double b = sc.nextDouble();
		System.out.println("�������� C :");
		double c = sc.nextDouble();
		if (((a < c) && (b > c)) || ((a > c) && (b < c))) {
			System.out.println("������� " + c + " � ����� " + a + " � " + b);
		} else {
			System.out.println("������� " + c + " �� � ����� " + a + " � " + b);
		}
	}

}
