package core;

public interface IStack {
	
	boolean isEmpty();
	int getSize();
	Object Top();
	boolean isFull();
	void pop(Object a);
	void push(int elm);
}
