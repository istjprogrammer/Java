public class BubbleSort {
	public static void main(String[] args){
		int data[] = {2, 9, 10, 3, 8, 6, 17};
		int pass = 1;
		
		for(int i = 0; i <data.length; i++)
			System.out.print(data[i] + "\t");
		
		System.out.println("\n\n버블정렬후...");
		
		for(int i=0; i<data.length-1; i++){
			for(int j=0; j<data.length-pass; j++){
				if(data[j] < data[j+1]){
					int temp = data[j];
					data[j] = data[j+1];
					data[j+1] = temp;
				}
			}
			pass++;
		}
		
		for(int i=0; i<data.length; i++)
			System.out.print(data[i]+ "\t");
	}
}