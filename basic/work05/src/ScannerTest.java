public class ScannerTest{
	public static void main(String[] args){
		java.util.Scanner scan = 
			new java.util.Scanner(System.in);
		
		System.out.print("�̸��Է�:");
		String name = scan.next();
		System.out.println("����� �̸���" + name + "�Դϴ�.");
		
		System.out.print("���� �Է�:");
		int age = scan.nextInt();
		System.out.println("����� ���̴� " + age + "�� �Դϴ�.");
		
		System.out.print("���� �Է�:");
		int point = scan.nextInt();
		System.out.println("����� ������ " + point + "�� �Դϴ�.");
	}
}