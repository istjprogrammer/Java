public class ArrayTest2{
	public static void main(String[] args) 
							throws java.io.IOException{
		char[] data = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		System.out.print("ã���� �ϴ� ���� �Է�: ");
		char search = (char)System.in.read();
		
		boolean flag = false;
		int i = 0;
		for(; i<data.length; i++){
			if(search == data[i]){
				flag = true;
				break;
			}else{
				flag = false;		
			}
		}
		
		if (flag == true)
			System.out.println("ã�Ҵ�." + (i+1) + "��° �ִ�");
		else
			System.out.println("�� ã�Ҵ�.");
	}
}