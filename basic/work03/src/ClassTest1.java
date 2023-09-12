class ClassDemo {
	int m_no;
	double m_point;
}

class ClassTest1 {
	int m_ival;
	double m_dval;
	
	public static void main(String[] args){
		//m_ival = 10;
		//new ClassTest1().m_ival = 10;
		//System.out.println(new ClassTest1().m_ival);
		
		ClassTest1 i = new ClassTest1();
		i.m_ival = 10;
		System.out.println(i.m_ival);
		
		//i = 100;
		
		System.out.println("---------------------------------");
		
		ClassDemo j = new ClassDemo();
		j.m_no = 100;
		j.m_point = 3.14;
		System.out.println(j.m_no + ", " + j.m_point);
	}
}