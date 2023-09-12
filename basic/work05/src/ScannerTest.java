public class ScannerTest{
	public static void main(String[] args){
		java.util.Scanner scan = 
			new java.util.Scanner(System.in);
		
		System.out.print("이름입력:");
		String name = scan.next();
		System.out.println("당신의 이름은" + name + "입니다.");
		
		System.out.print("나이 입력:");
		int age = scan.nextInt();
		System.out.println("당신의 나이는 " + age + "살 입니다.");
		
		System.out.print("점수 입력:");
		int point = scan.nextInt();
		System.out.println("당신의 점수는 " + point + "점 입니다.");
	}
}