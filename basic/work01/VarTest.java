class VarTest{
	public static void main(String[] args) {
		byte b1 = 127;
		java.lang.System.out.println(b1);
		
		//���� ����
		char c1 = 'a';
		java.lang.System.out.println(c1);
		
		char c2 = '��';
		java.lang.System.out.println(c2);
		
		//stack
		int a = 10;
		{
			int b = 20;
			{
				int c = 30;
				java.lang.System.out.println("c:" + c);
			}
			java.lang.System.out.println("b:" + b);
		}
		java.lang.System.out.println("a:" + a);		
	}
}
