class OpTest{
	public static void main(String[] args){
		//&&�� &�� ����
		int a = 10, b = 7;
		
		/*java.lang.System.out.println(a && b); �� ��� ���� �߻�*/
		java.lang.System.out.println(a>5 && b<3);
		
		java.lang.System.out.println(a>5 & b<3);//1���� �ᵵ ������ �� �̷�����.
		java.lang.System.out.println(a & b);
		
		java.lang.System.out.println(a<12 && ++b>5);
		java.lang.System.out.println("b:" + b);
		
		java.lang.System.out.println("------------------");
		//�� ��ȯ ������
		double d1=3.5, d2=2.3;
		
		/* int a = d1+d2; �� ��� ������ �߻��Ѵ�. */
		int c =(int)d1 + (int)d2;//�� ��� �Ҽ��� �ڸ��� �����ǰ� �ȴ�.
		java.lang.System.out.println("c:" + c);
		
		double d3 =c;
		java.lang.System.out.println("d3:" + d3);
		
		byte b1 = (byte)c;
		java.lang.System.out.println("b1:" + b1);
		
		b1 = 100 + 5;
		java.lang.System.out.println("b1:" + b1);
		
		b1 = (byte)(b1 + 5);
		java.lang.System.out.println("b1:" + b1);
		
		b1 += 5; //java������ �̷��� ���� ���� �����Ѵ�.
		
		float f1 = 3.14f;
		java.lang.System.out.println("f1:" + f1);
		
		/* f1 = f1 + 2.5; �� ��� ���� �߻� */
		f1 += 2.5;
		java.lang.System.out.println("f1:" + f1);
		
		int i = 'a';
		java.lang.System.out.println("i:" + i);//���ڰ� ���ڷ� ǥ���Ǿ� 97�� ��µȴ�.
		/*�ƽ�Ű �ڵ�� Ű����� �Է��� �� �ִ� ��� ���ڵ��� 128���� ���ڷ� ǥ���� �ȴ�.*/
		
		char c1 = 98;
		java.lang.System.out.println(c1);//���� 98�� �ش�Ǵ� �ƽ�Ű�ڵ忡 ��ϵ� ���� b�� ��µȴ�.
		
		long x = 10000000000L;
	}
}