class InputTest {
	public static void main(String[] args)
	throws java.io.IOException//�Է¿� ���� ó��
	{
		System.out.println("���ڸ� �Է��� �ּ��� : ");
		int input = java.lang.System.in.read();
		System.out.println("�Է¹��� ��:" + (char)input);
		
		System.in.skip(2);
		
		System.out.print("���ڸ� �Է��ϼ���: ");
		input = System.in.read()-48;
		System.out.println("�Է¹��� ��: " + input);
	}
}