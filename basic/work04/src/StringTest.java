public class StringTest {
	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		//String 클래스 사용법
		
		String str = new String();
		str = "홍길동";
		System.out.println(str);
		
		String str2 = new String("임꺽정");
		System.out.println(str2);
		
		String str3 = "강감찬";
		
		///String 클래스 APIs
		
		String s1 = "java";
		//String s2 = "java";
		String s2 = new String("java");
		
		//if(s1 == s2) 주소를 비교하는 메서드
			//System.out.println("s1과 s2는 같다.");
		//else
			//System.out.println("s1과 s2는 다르다.");
		
		if(s1.equals(s2))//값을 비교하는 메서드
			System.out.println("s1과 s2는 같다.");
		else
			System.out.println("s1과 s2는 다르다.");
		
		System.out.println("Java".equals(s2));
		
		String s3 = "java is beautiful";
		String s4 = "java just one";
		
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.charAt(3));
		
		System.out.println(s3.indexOf("is"));
		System.out.println(s3.indexOf("a"));
		System.out.println(s3.lastIndexOf("a"));
		System.out.println(s3.indexOf("love"));
		
		System.out.println(s3.substring(5, 6));
		System.out.println(s3.substring(5));
		
		String[] sp = s3.split(" ");
		for(String s : sp){
			System.out.println(s);
		}
		
		for(int i=0; i<3; i++){
			System.out.println(sp[i]);
		}
		
		////불변성///
		String s5 = "javo";
		s5 = "java";
		System.out.println("s5 : " + s5);
		//이 경우 성능이 저하될 수 있다.
		//새로운 메모리 주소에 다시 java라고 값이 할당되기 때문에
		
		String s6 = s5.concat(" is number one");
		System.out.println(s6);
		System.out.println(s5 == s6);
		
		StringBuffer s7 = new StringBuffer("java");
		StringBuffer s8 = s7.append("is number one");
	}
}