package core;

import static org.junit.Assert.assertNull;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class JUNITStack {

	@Test
	public void testCreteNewEmptyStack() {
		
		Stack s1 =  new Stack();
		int size = s1.getSize();
			
		assertEquals(0,size);
		assertTrue(s1.isEmpty());

	}
	@Test
	public void testPushElmToTop() { 
		
	Stack s2 = new Stack();
	Object elm = s2.Top();
	
	assertEquals(1,elm);
	assertTrue(s2.isFull());
	
	}
	
	public void LastInFirstOut()
	{
		Stack s3 = new Stack();
		
		assertNull(s3.pop());
		
		s3.push("element 1");
		s3.push("element 2");
	}
}
