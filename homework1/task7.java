package homework1;

import java.util.Scanner;

public class task7 {

	public static void main(String[] args) {
		// ������ 7:
		// �������� 3 ���������� �� ������������ � ��� (���������� ���), ����
		// ���� (����� � ������� �������), ���� ��� ����� � ����� ���.
		// ��������� ��������, ����� ����� ������� �� ������ �� ���� ����� ��
		// ������� �����:
		// - ��� ��� �����, ���� �� �������
		// - ��� ���� ����, �� �� ���� ���������
		// - ��� ����� � �� ���� ����� � �� ��� ���
		// - ��� ��� �����, �� ����� �� ���� � ��������
		// - ��� ���� ��-����� �� 10 ��, �� ����� �� ����.
		// ���������� ������� �������� ���� ��������� � ���������.

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���: ");
		int hour = sc.nextInt();
		System.out.println("�������� ���� ����: ");
		float monay = sc.nextFloat();
		System.out.println("����� �� ��? ");
		boolean sick = sc.nextBoolean();

		System.out.println("����� � : " + hour);
		boolean monay1 = monay >= 10;
		boolean monay3 = monay > 0;
		boolean sick1 = sick;
		boolean sick2 = !sick;
		if (sick1) {
			System.out.println("����� ���.");
			if (monay3) {
				System.out.println("�� �� ���� ���������.");
			} else {
				System.out.println("�� �� ���� � ���� � �� ��� ���.");
			}
		} else {
			System.out.println("�� ��� �����.");
			if (monay1) {
				System.out.println("������ �� ���� � ��������.");
			} else {
				System.out.println("�� ����� �� ����.");
			}
		}
	}

}
