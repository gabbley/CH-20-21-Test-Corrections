import java.util.NoSuchElementException;

public class IntStack {

	private int[] items;
	private int sp;
	
	public IntStack(){
		items = new int[1024];
		sp = 0;
	}
	
	public int peek(){
		if (sp==0){
			throw new NoSuchElementException();
		}
		return items[sp-1];
	}
	
	public boolean isEmpty(){
		return (sp==0);
	}
	
	public void push(int num){
		items[sp] = num;
		sp++;
	}
	
	public int pop(){
		return items[--sp];
	}
	
}
