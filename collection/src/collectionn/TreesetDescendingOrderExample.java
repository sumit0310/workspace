package collectionn;
import java.util.*;
import java.util.TreeSet;

public class TreesetDescendingOrderExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SortedSet<String>fruits=new Treeset<>(Comparator.reverseOrder());
		SortedSet<String> fruits=new Treeset<>(new Comparator<String>())
				{
			
			        public int compare(String s1,String s2)
			        {
			        	return s2.compareTo(s1);
			        }
			
				});
				
				fruits.add("Banana");
	            fruits.add("Apple");
	            fruits.add("Pineapple");
	            fruits.add("order");
	            
	}

}
