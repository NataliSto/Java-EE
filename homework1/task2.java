package homework1;

import java.util.Scanner;

public class task2 {

	public static void main(String[] args) {
//		"������ 2:
//			�������� 2 �������� ����������� ����� �� ���������. ��������
//			������� ����, �������, ������������, ������� �� ������� �
//			����������� ������� � ������� ���������� � ������������ ����
//			��������� � ���������. �������� ������ � ����� � ������� �������."
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� � :");
		double a = sc.nextDouble();
		System.out.println("�������� B :");
		double b = sc.nextDouble();
		double sum= a+b;
		double substraction = a-b;
		double multiplication = a*b;
		double div = a/b;
		double restOfDivision = a%b;
		
		System.out.println( " A + B = " + sum);
	System.out.println( " A * B = " + multiplication);
		System.out.println( " A - B = " + substraction);
		System.out.println( " A / B = " + div);
		System.out.println( " A % B = " + restOfDivision);
	}

}
