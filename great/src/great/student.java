package great;

import java.util.HashMap;
import java.util.Map;

public class student{
	public static void main(String[]args) {
		
		Map<String,Integer>numberMapping=new HashMap<>();
		
		numberMapping.put("one",1);
		numberMapping.put("om",4);
		numberMapping.put("o",7);
		
		numberMapping.putIfAbsent("four",4);
		
		System.out.println(numberMapping);
		
	}
}














