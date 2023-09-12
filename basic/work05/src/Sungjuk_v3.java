// 클래스를 이용한 성적표
class student{
	String name;
	int no;
	int kor;
	int eng;
	int tot;
	int avg;
	int rank;
	char grade;
	
	Student(String name, int no, int kor, int eng){
		this.name = name;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
	}	
}

public class Sungjuk_v3{
	public static void main(String[] args){
		Student[] st = new Student[3];
		st[0] = new Student("홍길동", 1, 98, 90);
		st[1] = new Student("임꺽정", 2, 76, 55);
		st[2] = new Student("신돌석", 3, 85, 73);
		
		// 총점 구하기
		for(int i=0; i<st.length; i++) {
			st[i].tot = st[i].kor + st[i].eng;
		}
		
		// 평균 구하기
		for(int i=0; i<st.length; i++) {
			st[i].avg = st[i].tot /2.0;
		}
		
		// 학점 구하기
		for(int i=0; i<no.length; i++) {
			if(st[i].avg>=90)
				st[i].grade = 'A';
			else if(st[i].avg>=80)
				st[i].grade = 'B';
			else if(st[i].avg>=70)
				st[i].grade = 'C';
			else if(st[i].avg>=60)
				st[i].grade = 'D';
			else
				st[i].grade = 'F';
		}
		
		// 등수 구하기
		
		// 출력
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<st.length; i++) {
			System.out.println(st[i].no + "\t" + st[i].kor + "\t"
				+ st[i].eng + "\t" + st[i].tot + "\t" +
				st[i].avg + "\t" + st[i].grade);
		}
		
		//정렬 후 출력
		for(int row=0; row<st.length-1; row++){
			for(int col=row+1; col<st.length; col++){
				if(st[row].avg > st[col].avg){
					Student temp = st[row];
					st[row] = st[col];
					st[col] = temp;
				}
			} // for(col) 종료
		}// for(row) 종료
		
				
		System.out.println("***성적 결과***");
		System.out.println("학번\t국어\t영어\t총점\t평균\t학점");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
	}
}