class InputTest {
	public static void main(String[] args)
	throws java.io.IOException//입력에 예외 처리
	{
		System.out.println("문자를 입력해 주세요 : ");
		int input = java.lang.System.in.read();
		System.out.println("입력받은 값:" + (char)input);
		
		System.in.skip(2);
		
		System.out.print("숫자를 입력하세요: ");
		input = System.in.read()-48;
		System.out.println("입력받은 값: " + input);
	}
}