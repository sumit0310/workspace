package collectionn;

import java.util.LinkedHashMap;
import java.util.Scanner;

public class LinkedHashedMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		LinkedHashMap<String,Integer>wordNumberMapping=new LinkedHashMap<>();
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<4;i++)
			
		{
			 System.out.println("enter the keys");
			 String a=sc.next();
			 System.out.println("enter the values");
			 Integer b=sc.nextInt();
			 wordNumberMapping.put(a,b);
			 System.out.println(wordNumberMapping);
		}
	}

}
