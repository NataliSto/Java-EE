package homework1;

import java.util.Scanner;

public class task4 {

	public static void main(String[] args) {
//		������ 4:
//			�������� 2 �������� ����� �� ��������� � �� ������������ �
//			��������� ���.
		Scanner sc = new Scanner(System.in);
		System.out.println("�������� � :");
		int a = sc.nextInt();
		System.out.println("�������� B :");
		int b = sc.nextInt();
		if(a>b){
			System.out.println( b+ " " + a);
		}else{
			System.out.println(a + " " + b);
		}


	}

}
