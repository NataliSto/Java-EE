package homework1;

import java.util.Scanner;

public class task9 {

	public static void main(String[] args) {
		// ������ 9:
		// �� �� ������� ��������, ����� ���� �� ��������� 2 ����������
		// ���������� ����� a,b.
		// ���������� �� ������ � ��������� ���� ���������� ����� ��
		// �������������� �� ����� ����� � �����, ����� � ������ �����.
		// ������ �����: a,b - ���������� ����� �� ��������� [10..99].
		// ������: 15, 25
		// �����: 375, 5 �������

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� � :");
		int a = sc.nextInt();
		System.out.println("�������� B :");
		int b = sc.nextInt();
		if ((a < 9) && (a > 100) && (b < 9) && (b > 100)) {
			System.out.println("������ ��� ��������� �����!");
		} else {
			int mult = a * b;

			if (mult % 2 == 0) {
				System.out.println(mult + ", " + mult % 10 + " �����");
			} else {
				System.out.println(mult + ", " + mult % 10 + " �������");
			}
		}
	}

}
