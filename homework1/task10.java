package homework1;

import java.util.Scanner;

public class task10 {

	public static void main(String[] args) {
		// ������ �� �� ������� �������� � ����. ����� 2 ���� � ���������� 2 �
		// 3 ����� � �� �������� ������������.
		// �� �� ������� ��������, ����� �� ����� ���� ������� ��� �� ��������
		// ��������� � ���� ����, �.�. ��-����� ���� �� �� ����� ����� ��
		// ������. ������ �� ����� �� �� ������� � �������� ���������� ����.
		// ������ �����: ���������� ����� �� ��������� [10..9999].
		// ������: 107
		// �����: 21 ���� �� 2 �����,
		// 21 ���� �� 3 �����
		// ������������ ���� �� 2 �����

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���� �� ���������� :");
		int capacity = sc.nextInt();
		int num = capacity / 5;
		int rest = capacity % 5;
		if ((capacity >= 10) && (capacity <= 9999)) {
			if (rest == 0) {
				System.out.println(num + " ���� �� 2�,");
				System.out.println(num + " ���� �� 3�.");
			} else {
				switch (rest) {
				case 1:
					System.out.println((num - 1) + "���� �� 2�, ");
					System.out.println((num - 1) + "���� �� 3�.");
					System.out.println("������������ 2 ���� �� 3�.");
					break;
				case 2:
					System.out.println((num) + "���� �� 2�, ");
					System.out.println((num) + "���� �� 3�.");
					System.out.println("������������ ���� �� 2�.");
					break;
				case 3:
					System.out.println((num) + "���� �� 2�, ");
					System.out.println((num) + "���� �� 3�.");
					System.out.println("������������ ���� �� 3�.");
					break;
				case 4:
					System.out.println((num) + "���� �� 2�, ");
					System.out.println((num) + "���� �� 3�.");
					System.out.println("2 ������������ ���� �� 2�.");
					break;
				}
			}
		} else {
			System.out.println("������ ��� ���������� ���� �� ����������");
		}

	}

}
