package great;
import java.util.LinkedList;
import java.util.Queue;

public class QueueEample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      Queue<String>waitingQueue=new LinkedList<>();
      
      waitingQueue.add("Rajeev");
      waitingQueue.add("yash");
      waitingQueue.add("bisuuu");
      waitingQueue.add("neha");

      waitingQueue.add("swaha");
System.out.println("waitingQueue:"+waitingQueue);

      
String name=waitingQueue.remove();

System.out.println("Removed from WaitingQueue:"+name+"|new waitingQueue:" + waitingQueue);

name=waitingQueue.poll();
System.out.println("Removed from WaitingQueue:"+name+"|new waitingQueue:" + waitingQueue);

	}

}
