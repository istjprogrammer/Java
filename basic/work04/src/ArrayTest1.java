public class ArrayTest1 {
	public static void main(String[] args) {
		int no=1, kor=80, eng=90, mat=89;
		
		int first[] = new int[4];
		first[0] = 1;
		first[1] = 80;
		first[2] = 90;
		first[3] = 89;	

		for(int i=0; i<4; i++){
			System.out.println(first[i]);
		}
		
		int[] second = {1, 80, 90, 89};
	}
}