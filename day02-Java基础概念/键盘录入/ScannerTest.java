//1.����
import java.util.Scanner;

public class ScannerTest{
	public static void main(String[] args){
		//2.��������
		Scanner sc = new Scanner(System.in);
		
		//3.��������
		System.out.println("�������һ������");
		int number1 = sc.nextInt();
		
		//�ٴν��ܵڶ�������
		System.out.println("������ڶ�������");
		int number2 = sc.nextInt();
		
		System.out.println(number1 + number2);
	}
}