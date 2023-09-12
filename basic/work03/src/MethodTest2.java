// 인자 전달 방식
/*
class MethodTest2 {
	void swap(int num1, int num2){
		int temp = num1;
		num1 = num2;
		num2 = temp;
	}
	
	public static void main(String[] args) {
		int num1 = 10, num2 = 15;
		
		System.out.println("두 수의 교환");
		new MethodTest2().swap(num1, num2);
		
		System.out.println("num1=" + num1 + ", num2=" + num2); 
	}
}
*/

class MethodTest2 {
	int num1 = 10, num2 = 15;
	
	void swap(MethodTest2 m){
		int temp = m.num1;
		m.num1 = m.num2;
		m.num2 = temp;
	}
	
	public static void main(String[] args) {	
		System.out.println("두 수의 교환");
		MethodTest2 m2 = new MethodTest2();
		m2.swap(m2);
		
		System.out.println("num1=" + m2.num1 + ", num2=" + m2.num2); 
	}
}
