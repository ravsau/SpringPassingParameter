package hello;

public class Greeting {

	private final long id;
	private final String content;
	private int x=5;
	
	
	
	public Greeting (long id, String content ){
		
		this.id=id;
		this.content =content;
		
	}

	
	
	
	


	public long getId(){
		
		return id;
		
	}
	
	public String getContent (){
		return content;
		
	}
	
	public int getX(){
		
		return x;
	}
	
	@Override
	public String toString(){
		
		return content;
		
		
	}
}
