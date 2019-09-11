package great;

public class Enumtest {
	
	public enum rainbowcolor{
		
		red,orange,yellow,green,violet,indigo,blue
	}
	
	rainbowcolor rcolor;
	public Enumtest(rainbowcolor rcolor)
	{
		this.rcolor=rcolor;
		
				
	
	}
	
	public void getrainbowcolor()
	{
		switch(rcolor)
		{
		
		case red: System.out.println("color is red");
        break;
        
		case orange: System.out.println("color is orange");
        break;
		
		case yellow: System.out.println("color is yellow");
        break;
		
		case green: System.out.println("color is green");
        break;
		
		case violet: System.out.println("color is violet");
        break;
		
		case indigo: System.out.println("color is indigo");
        break;
		
		case blue: System.out.println("color is blue");
        break;
		
       default:
    	        System.out.println("not valid");
    	        
		}
	}
	
	
	
	public static void main(String[] args)
	{
		Enumtest et=new Enumtest(rainbowcolor.indigo);
		System.out.println(et.rcolor);
		et.getrainbowcolor();
		
		
		
		
		
		
		}
	}


