class OpTest{
	public static void main(String[] args){
		//&&와 &의 차이
		int a = 10, b = 7;
		
		/*java.lang.System.out.println(a && b); 이 경우 에러 발생*/
		java.lang.System.out.println(a>5 && b<3);
		
		java.lang.System.out.println(a>5 & b<3);//1개만 써도 연산은 잘 이뤄진다.
		java.lang.System.out.println(a & b);
		
		java.lang.System.out.println(a<12 && ++b>5);
		java.lang.System.out.println("b:" + b);
		
		java.lang.System.out.println("------------------");
		//형 변환 연산자
		double d1=3.5, d2=2.3;
		
		/* int a = d1+d2; 이 경우 에러가 발생한다. */
		int c =(int)d1 + (int)d2;//이 경우 소수점 자리는 삭제되게 된다.
		java.lang.System.out.println("c:" + c);
		
		double d3 =c;
		java.lang.System.out.println("d3:" + d3);
		
		byte b1 = (byte)c;
		java.lang.System.out.println("b1:" + b1);
		
		b1 = 100 + 5;
		java.lang.System.out.println("b1:" + b1);
		
		b1 = (byte)(b1 + 5);
		java.lang.System.out.println("b1:" + b1);
		
		b1 += 5; //java에서는 이렇게 쓰는 것을 권장한다.
		
		float f1 = 3.14f;
		java.lang.System.out.println("f1:" + f1);
		
		/* f1 = f1 + 2.5; 이 경우 에러 발생 */
		f1 += 2.5;
		java.lang.System.out.println("f1:" + f1);
		
		int i = 'a';
		java.lang.System.out.println("i:" + i);//문자가 숫자로 표현되어 97이 출력된다.
		/*아스키 코드는 키보드로 입력할 수 있는 모든 문자들이 128개의 숫자로 표현이 된다.*/
		
		char c1 = 98;
		java.lang.System.out.println(c1);//숫자 98에 해당되는 아스키코드에 등록된 문자 b가 출력된다.
		
		long x = 10000000000L;
	}
}