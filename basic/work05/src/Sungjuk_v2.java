// 2���� �迭�� �̿��� ����ǥ
public class Sungjuk_v2{
	public static void main(String[] args){
		String[] names = {"ȫ�浿", "�Ӳ���", "�ŵ���"};
		char[] grade = new char[3];
		int[][] sungjuk = {
			{1, 98, 90, 0, 0, 0},
			{2, 76, 55, 0, 0, 0},
			{3, 85, 73, 0, 0, 0},
		};
		
		// ���� ���ϱ�
		for(int i=0; i<sungjuk.length; i++) {
			sungjuk[i][3] = sungjuk[i][1] + sungjuk[i][2];
		}
		
		// ��� ���ϱ�
		for(int i=0; i<sungjuk.length; i++) {
			int tot = sungjuk[i][3];
			double avg = tot / 2.0; // ��� ���
			sungjuk[i][4] = avg; // ��� ����
		}
		
		// ���� ���ϱ�
		for(int i=0; i<no.length; i++) {
			if(avg[i]>=90)
				grade[i] = 'A';
			else if(avg[i]>=80)
				grade[i] = 'B';
			else if(avg[i]>=70)
				grade[i] = 'C';
			else if(avg[i]>=60)
				grade[i] = 'D';
			else
				grade[i] = 'F';
		}
		
		// ��� ���ϱ�
		
		// ���
		System.out.println("***���� ���***");
		System.out.println("�й�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
		
		// ���� �� ���
		for(int row=0; row<sungjuk.length-1; row++){
			for(int col=row+1; col<sungjuk.length; col++){
				if(sungjuk[row][4] > sungjuk[col][4]){
					int[] rowTemp = sungjuk[row];
					sungjuk[row] = sungjuk[col];
					sungjuk[col] = rowTemp;
					
					char ctemp = grade[row];
					grade[row] = grade[col];
					grade[col] = cTemp;
					
					String stemp = names[row];
					names[row] = names[col];
					names[col] = stemp;					
				}
			} // for(col) ����
		}// for(row) ����
				
		System.out.println("***���� ���***");
		System.out.println("�й�\t����\t����\t����\t���\t����");
		System.out.println("-----------------------------------------------");
		for(int i=0; i<no.length; i++) {
			System.out.println(no[i] + "\t" + kor[i] + "\t"
				+ eng[i] + "\t" + tot[i] + "\t" +
				avg[i] + "\t" + grade[i]);
		}
	}
}