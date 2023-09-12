//1차원 배열을 이용한 성적표

public class Sungjuk_v1{
	public static void main(String[] args){
		String[] names = {"홍길동", "임꺽정", "신돌석"};
		int[] no = {1, 2, 3};
		int[] kor = {98, 76, 85};
		int[] eng = {90, 55, 73};
		int[] tot = new int[3];
		int[] avg = new int[3];
		char[] grade = new char[3];
		int[] rank = new int[3];
		
		//총점 구하기
		for(int i = 0; i<no.length; i++){
			tot[i] = kor[i] + eng[i];
		}
		
		//평균 구하기
		for(int i = 0; i<no.length; i++){
			avg[i] = tot[i]/2;
		}
		
		//학점 구하기
		  for (int i = 0; i < no.length; i++) {
            if (avg[i] >= 90) {
                grade[i] = 'A';
            } else if (avg[i] >= 80) {
                grade[i] = 'B';
            } else if (avg[i] >= 70) {
                grade[i] = 'C';
            } else if (avg[i] >= 60) {
                grade[i] = 'D';
            } else {
                grade[i] = 'F';
            }
        }
		//등수 구하기
		
		//출력
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
		
		//정렬 후 출력
		for(int row=0; row<no.length-1; row++) {
			for(int col=row+1; col<no.length; col++) {
				if(avg[row] > avg[col]) {
					int itemp = no[row];
					no[row] = no[col];
					no[col] = itemp;
					
					itemp = kor[row];
					kor[row] = kor[col];
					kor[col] = itemp;
					
					itemp = eng[row];
					eng[row] = eng[col];
					eng[col] = itemp;
					
					itemp = tot[row];
					tot[row] = tot[col];
					tot[col] = itemp;
					
					itemp = avg[row];
					avg[row] = avg[col];
					avg[col] = itemp;
					
					itemp = grade[row];
					grade[row] = grade[col];
					grade[col] = (char)itemp;
					
					String stemp = names[row];
					names[row] = names[col];
					names[col] = stemp;
				}
			}// for(col) 종료
		}// for(row) 종료
		
		System.out.println("***성적 결과***");
		System.out.println("학번\t이름\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
	}
}