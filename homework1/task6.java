package homework1;

import java.util.Scanner;

public class task6 {

	public static void main(String[] args) {
		// ������ 6:
		// �������� 3 ����� �� ������������ �1, �2 � �3. ��������� �����������
		// �� ����, �� �1 �� ��� ���������� �� �2, �2 �� ��� ���������� �� �3, �
		// �3 �� ��� ������� �������� �� �1.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� �1 :");
		int a1 = sc.nextInt();
		System.out.println("�������� A2 :");
		int a2 = sc.nextInt();
		System.out.println("�������� A3 :");
		int a3 = sc.nextInt();
		int n = a1;
		a1 = a2;
		a2 = a3;
		a3 = n;
		System.out.println("A1 = " + a1);
		System.out.println("A2 = " + a2);
		System.out.println("A3 = " + a3);

	}

}
