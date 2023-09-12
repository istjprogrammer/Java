class ThisDemo {
	int iVal;
	double dVal;
	
	ThisDemo(int iVal, double dVal){
		this.iVal = iVal;
		this.dVal = dVal;
	}
	
	void display(){
		System.out.println(this.iVal + ", " + this.dVal);
	}
}

public class ThisTest {
	public static void main(String[] args) {
		ThisDemo t1 = new ThisDemo(10, 10.5);
		ThisDemo t2 = new ThisDemo(20, 20.5);
		ThisDemo t3 = new ThisDemo(30, 30.5);
		
		t1.display();
		t2.display();
		t3.display();
	}
}