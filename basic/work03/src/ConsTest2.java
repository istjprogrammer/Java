class ConsDemo2{
	int iVal;
	double dVal;
	
	ConsDemo2(int i, double d){
		iVal = i;
		dVal = d;
	}
	
	ConsDemo2() {}
	
	void setVal(int i, double d){
		/*
			���� �ڵ�
		*/

		iVal = i;
		dVal = d;
	}
}

public class ConsTest2 {
	public static void main(String[] args) {
		ConsDemo2 ob = new ConsDemo2();
		System.out.println(ob.iVal);
		
		//���� �ڵ�
		/*
			100�� ������ �ִ��� ������ ����
		*/
		//ob.iVal = 100;
		//ob.dVal = 10.0;
		
		
		ob.setVal(100, 10.0);
		
		ConsDemo2 ob2 = new ConsDemo2(100, 10.0);
		
		
	}
}