package homework1;

import java.util.Scanner;

public class task11 {

	public static void main(String[] args) {
		// ������ 11:
		// ��������� ��������, ����� �� ������ ���������o ����� ���������
		// ���� ������� �� ���� �� ����� ���� �����. ��� ���������� ����� ��
		// ���� ����� 0.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ����� :");
		int a = sc.nextInt();
		if (!(a >= 100) && (a <= 999)) {
			System.out.println("������ ��� ��������� �����");
		} else {
			int num1 = (a % 10);
			int num2 = ((a / 10)%10 );
			
			int num3 = ((a % 100) / 10);
			if ((num1 == 0) ||(num2 == 0) ||(num3 == 0)) {
				System.out.println("����� �� ������� ���������� ������� � ����� �� 0");
			} else {
				if ((a % num1 == 0) && (a % num2 == 0) && (a % num3 == 0)) {
					System.out.println("������� �� ���� �� ����� ���� �����.");
				} else {
					System.out.println("������� �� �� ���� �� ����� ���� �����.");
				}
			}
		}

	}

}
