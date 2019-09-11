package great;

public class Arraycopy {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int[] source= {00,33,11,55,7,17};
		int[] destination=new int[] {1,2,3,4,5,6,7};
		
		System.arraycopy(source, 1, destination, 0,5);
		for(int i=0;i<=6;i++) {
			
			System.out.print(destination[i]+"\t");
			
		}
	}

}
