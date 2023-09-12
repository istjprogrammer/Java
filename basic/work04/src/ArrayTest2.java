public class ArrayTest2{
	public static void main(String[] args) 
							throws java.io.IOException{
		char[] data = {'a', 'b', 'c', 'd', 'e', 'f'};
		
		System.out.print("찾고자 하는 문자 입력: ");
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
			System.out.println("찾았다." + (i+1) + "번째 있다");
		else
			System.out.println("못 찾았다.");
	}
}