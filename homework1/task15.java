package homework1;

import java.util.Scanner;

public class task15 {

	public static void main(String[] args) {
		// ������ 15:
		// �� �� ������� ��������, ����� ������� ���������� ����� �� ���������
		// [0..24].
		// ���������� �� ������ ������������� ��������� ��������� ���������
		// ���.
		// ��������� ��:
		// [18..4] - ����� �����;
		// [4..9] - ����� ����;
		// [9..18] - ����� ���
		// ������: 10
		// �����: ����� ���

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���:");
		int hour = sc.nextInt();
		if ((hour < 0) || (hour > 24)) {
			System.out.println("Invalid hour ");
		} else {
			if (((hour >= 18) && (hour < 24)) || ((hour >= 0) && (hour < 4))) {
				System.out.println("����� �����!");
			}
			if ((hour >= 4) && (hour < 9)) {
				System.out.println("����� ����!");
			}
			if ((hour >= 9) && (hour < 18)) {
				System.out.println("����� ���!");

			}
		}
	}

}
