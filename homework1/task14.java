package homework1;

import java.util.Scanner;

public class task14 {

	public static void main(String[] args) {
		// ������ 14:
		// �� �� ������� ��������, ����� �� �������� ���������� �� 2 �������
		// �� ���������� ����� ������� ������� ���� �� �������� � ������� ���
		// �������� ����.
		// ���������� ����� � ���������.
		// �������� �� ��� ������ ����� �� ��������� [1..8].
		// ������: 2 2 3 2
		// �����: ��������� �� � �������� ����

		Scanner sc = new Scanner(System.in);
		System.out.print("��������  �1 :");
		int x1 = sc.nextInt();
		System.out.print("��������  �2 :");
		int x2 = sc.nextInt();
		System.out.print("��������  y1 :");
		int y1 = sc.nextInt();
		System.out.print("��������  y2 :");
		int y2 = sc.nextInt();
		boolean x11 = ((x1 >= 1) && (x1 <= 8));
		boolean y11 = ((y1 >= 1) && (y1 <= 8));
		boolean x21 = ((x2 >= 1) && (x2 <= 8));
		boolean y21 = ((y2 >= 1) && (y2 <= 8));
		if (!(x11 && x21 && y11 && y21)) {
			System.out.println("��������� ����������!");
		} else {
			boolean x12 = (x1 % 2 == 0);
			boolean x22 = (x2 % 2 == 0);
			boolean y12 = (y1 % 2 == 0);
			boolean y22 = (y2 % 2 == 0);
			if ((x12 && x22 && y12 && y22)||(!(x12 && x22 && y12 && y22)) ){
				System.out.println(" ������� ����");
			} else {
				System.out.println("�������� ����");
			}
		}
	}
}
