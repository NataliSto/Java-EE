package homework1;

import java.util.Scanner;

import javax.sound.midi.Synthesizer;

public class task16 {

	public static void main(String[] args) {
		// ������ 16:
		// �������� � ���������� ���������� ����� �� ���� abc.
		// ������ �� �� ������� ����:
		// ��� a = b = c - �����: ������� �� �����;
		// ��� a>b>c - �����: ������� �� ��� �������� ���;
		// ��� a<b<c ������� �� � �������� ���;
		// � �����: ������� �� ����������, �� ����������� ������.
		// �� �� ������� ��������, ����� ������� ��������� �� ���������� ��
		// ������� �� ������� � �������.
		// ������: 345
		// �����: �������� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� ���������� �����:");
		int num = sc.nextInt();
		if (((num < 100) && (num > 999))) {
			System.out.println("Invalid number !");
		}
		if((num >= 100) && (num <= 999)){
			int num1 = ((num / 100) % 10);
			int num2 = (num % 100) / 10;
			int num3 = num % 10;
			if (((num1 == num2) && (num2 == num3)) || ((num1 > num2) && (num2 > num3))
					|| ((num1 < num2) && (num2 < num3))) {
				System.out.println("������� �� ����������!");
			} else {
				if ((num1 == num2) && (num2 == num3)) {
					System.out.println("������� �� �����!");
				}
				if ((num1 > num2) && (num2 > num3)) {
					System.out.println(" ������� �� � �������� ���!");
				}
				if ((num1 < num2) && (num2 < num3)) {
					System.out.println("������� �� ��� �������� ���!");
				}
			}
		}

	}
}