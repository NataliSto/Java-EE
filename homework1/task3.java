package homework1;

import java.util.Scanner;

public class task3 {

	public static void main(String[] args) {
//		������ 3:
//			�������� 2 �������� ����� �� ��������� � ��������� ���������� ��.
//			������������ ������ ���������

		Scanner sc = new Scanner(System.in);
		System.out.println("�������� � :");
		double a = sc.nextDouble();
		System.out.println("�������� B :");
		double b = sc.nextDouble();
		double a1 = b;
		b= a;
		a= a1;
		System.out.println("A = " + a);
		System.out.println("B= " + b);
		
	}

}
