package collectionn;
package test.Generic;

class TestGeneric<T>
{
	T Obj;
	TestGeneric(T obj)
	{
		this.Obj = obj;
	
	}


    public T getObject()  { return this.obj; } 
} 
   
// Driver class to test above 
class Main 
{ 
    public static void main (String[] args) 
    { 
        // instance of Integer type 
        Test <Integer> iObj = new Test<Integer>(15); 
        System.out.println(iObj.getObject()); 
   
        // instance of String type 
        Test <String> sObj = 
                          new Test<String>("GeeksForGeeks"); 
        System.out.println(sObj.getObject()); 
    } 
}
}
public class GenExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
