package great;
import java.util.Scanner;

public class hut {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int space,size,k;
		Scanner sc=new Scanner(System.in);
		size=sc.nextInt ();
		for(int i=1;i< size;i++)
		{
			for(space=1;space<size;space++)
			{
				System.out.print(" ");
			}
		    for (k=0;k<i;k++)
		    {
		    	System.out.print(" * ");
		    	
		    }
		    System.out.println(" ");
			
		
		}
	}

}
