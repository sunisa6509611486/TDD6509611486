package core;
import java.util.ArrayList;

public class Stack implements IStack {
	
	private ArrayList<Object> num;
	private int top;
	
	
	public Stack() {
		num = new ArrayList<Object>();
	}
	
	@Override
	public boolean isEmpty() {
		if(num.size() == 0)// TODO Auto-generated method stub
			return true;
		else 
			return false;
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void push(int elm) {
		num.add(elm);
		top = elm;// TODO Auto-generated method stub

	}

	@Override
	public int Top() {
		// TODO Auto-generated method stub
		return top;
	}

	@Override
	public boolean isFull() {
		if(num.size() == 1)
			return true;
		else			// TODO Auto-generated method stub
			return false;
	}
	

