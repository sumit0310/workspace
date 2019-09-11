package great;

import java.util.ArrayList;
import java.util.List;


public class CreateArrayListFromCollectionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		List<Integer>firstfiveprimenumbers=new ArrayList<>();
		firstfiveprimenumbers.add(2);
		firstfiveprimenumbers.add(3);
		firstfiveprimenumbers.add(4);
		firstfiveprimenumbers.add(5);
		firstfiveprimenumbers.add(7);
		firstfiveprimenumbers.add(11);
	
		
		List<Integer>firsttenprimenumbers=new ArrayList<>(firstfiveprimenumbers);
		List<Integer>nextfiveprimenumbers=new ArrayList<>();
		nextfiveprimenumbers.add(13);
		nextfiveprimenumbers.add(17);
		nextfiveprimenumbers.add(19);
		nextfiveprimenumbers.add(23);
		nextfiveprimenumbers.add(29);
		
		firsttenprimenumbers.addAll(nextfiveprimenumbers);
		System.out.println(firsttenprimenumbers);
		
	}

}
