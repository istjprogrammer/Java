class MethodTest {
	int sum(int num1, int num2){
		System.out.println("두 수의 합계");
		int result = num1 + num2;
		return result;
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		int result = new MethodTest().sum(num1, num2);
		System.out.println("결과 : " + result);
	}
}