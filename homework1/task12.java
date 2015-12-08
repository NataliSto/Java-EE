package homework1;

import java.util.Scanner;

public class task12 {

	public static void main(String[] args) {
		// ��������� ������ �� ������ ������ ������ �� 4 � ����������
		// ����������, �� ��� �������� ������ �� 400, �.�. 1900 �� � ���������,
		// �� 1600 � 2000 �� ���������.
		// ��������� ��������, ����� �� ������ ���, �����, ������ ���������
		// ���������� ����.
		// ������ �����: ��� ����� �� ���, �����, ������.
		// ������: 28, 2, 2000
		// �����: 1,3,2000

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���:");
		int day = sc.nextInt();
		System.out.println("�������� �����:");
		int month = sc.nextInt();
		System.out.println("�������� ������:");
		int year = sc.nextInt();
		if ((day == 31) && (month == 12)) {
			System.out.println("01.01." + (year + 1));
		} else {
			switch (month) {
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if ((day > 0) && (day < 32)) {
					if (day == 31) {
						System.out.println("01." + (month + 1) + "." + year);
					} else {
						System.out.println((day + 1) + "." + month + "." + year);
					}
				}
				break;
			case 4:
			case 6:
			case 9:
			case 11:
				if ((day > 0) && (day < 31)) {
					if (day == 30) {
						System.out.println("01." + (month + 1) + "." + year);
					} else {
						System.out.println((day + 1) + "." + month + "." + year);
					}
				}
				break;
			case 2:
				if ((year % 4 == 0) && (!(year % 100 == 0)) && (year % 400 == 0)) {
					if ((day > 0) && (day < 30)) {
						if (day == 29) {
							System.out.println("01.03." + year);
						} else {
							System.out.println((day + 1) + ".02." + year);
						}
					}
				} else {
					if ((day > 0) && (day < 29)) {
						if (day == 28) {
							System.out.println("01.03." + year);
						} else {
							System.out.println((day + 1) + ".02." + year);
						}
					}
					break;

				}
			}
		}
	}

}
