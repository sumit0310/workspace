package great;

import java.util.*;

public class Collection{

	public static void main(String[] args)//array list ka program h ye
	{
		// TODO Auto-generated method stub

		ArrayList <String> list =new  ArrayList<String>();
		
		list.add("veena");
		list.add("zara");
		list.add("akshita");
		list.add("ankita");
		list.add("srishty");
		list.add("deeps");
		list.add("ashita");
		
		
		System.out.println(list.size());
		
		Iterator itr=list.iterator();
		while(itr.hasNext()) 
		{
			System.out.println(itr.next());
		}
		
		
		
		
	}

}
