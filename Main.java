
public class Main
{
	public static void main(String[] args) {
	    Channel ch=new Channel();
	    Subscriber s1=new Subscriber("a");
	    Subscriber s2=new Subscriber("b");
	    
	    ch.subscribe(s1);
	    ch.subscribe(s2);
	    
	 //  ch.unsubscribe(s2);
	    s1.subscribeChannel(ch);
	    s2.subscribeChannel(ch);
	   
	    ch.upload("How to learn programming?");
	    
	}
}
