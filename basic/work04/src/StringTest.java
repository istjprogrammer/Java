public class StringTest {
	public static void main(String[] args) {
		String[] names = new String[10];
		names[0] = "Tom";
		names[1] = "Johnson";
		names[2] = "Marry";
		
		//String Ŭ���� ����
		
		String str = new String();
		str = "ȫ�浿";
		System.out.println(str);
		
		String str2 = new String("�Ӳ���");
		System.out.println(str2);
		
		String str3 = "������";
		
		///String Ŭ���� APIs
		
		String s1 = "java";
		//String s2 = "java";
		String s2 = new String("java");
		
		//if(s1 == s2) �ּҸ� ���ϴ� �޼���
			//System.out.println("s1�� s2�� ����.");
		//else
			//System.out.println("s1�� s2�� �ٸ���.");
		
		if(s1.equals(s2))//���� ���ϴ� �޼���
			System.out.println("s1�� s2�� ����.");
		else
			System.out.println("s1�� s2�� �ٸ���.");
		
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
		
		////�Һ���///
		String s5 = "javo";
		s5 = "java";
		System.out.println("s5 : " + s5);
		//�� ��� ������ ���ϵ� �� �ִ�.
		//���ο� �޸� �ּҿ� �ٽ� java��� ���� �Ҵ�Ǳ� ������
		
		String s6 = s5.concat(" is number one");
		System.out.println(s6);
		System.out.println(s5 == s6);
		
		StringBuffer s7 = new StringBuffer("java");
		StringBuffer s8 = s7.append("is number one");
	}
}