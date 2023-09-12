public class ArrayTest3{
	public static void main(String[] args){
		int first[] = {1, 78, 65, 89};
		int second[] = new int[4];
		int third[] = new int[4];
		
		int arr[][] = new int[3][4];
		
		int [][]arr2 = {{1, 78, 65, 89},
						{2, 78, 65, 89},
						{3, 78, 65, 89}};
						
		System.out.println(first[0]);
		System.out.println(arr2[0][0]);
		
		//불규칙 배열
		char[][] name = new char[2][6];
		
		name[0][0] = 'T';
		name[0][1] = 'o';
		name[0][2] = 'm';
		
		name[1][0] = 'M';
		name[1][1] = 'a';
		name[1][2] = 'r';
		name[1][3] = 'r';
		name[1][4] = 'y';
		
		char[][] name2 = new char[2][];
		name2[0] = new char[3];
		name2[1] = new char[5];
		
		//공항 셔틀버스 탑승객의 수를 저장하는 프로그램
		//셔들이 주말에는 10회 운행하고, 주말에는 2회 운행한다.
		int bus[][] = new int[7][];
		for (int i=0; i<5; i++){
			shuttle[i] = new int[10];
		}
		
		bus[5] = new int[2];
		bus[6] = new int[2];
		
		for(int i=0; i<5; i++){
			for(int i=0; j<10; j++){
					bus[i][j] = i+j+10;
			}
		}
		
		for(int i=5; i<7; i++){
			for(int i=0; j<2; j++){
					bus[i][j] = i+j+10;
			}
		}
		
		System.out.println(bus);
	}
}