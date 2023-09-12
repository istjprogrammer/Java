// javac -d ../bin newtest.java
// java -cp ../bin newtest

class ControlTest {
	public static void main(String[] args) throws java.io.IOException{
		
		char choice;
		
		do{
			
		System.out.println("Help on: ");
		System.out.println("  1.  if");
		System.out.println("  2.  switch");
		System.out.println("  3.  for");
		System.out.println("  4.  while");
		System.out.println("  5.  do-while");
		System.out.print("Choose one: ");
		
		choice = (char)System.in.read();
		} while(choice <'1' | choice > '5');
		
		System.out.print("\n");
		
		switch(choice) {
			case '1':
				System.out.print("if 문법...");
				break;
				
		}
		char ch;
		
		System.out.println("Enter a period to stop.");
		do{
			ch = (char)System.in.read();
		}while(ch != '.');
		
		System.out.println("공백의 갯수 " + spaces);
		
	}
}