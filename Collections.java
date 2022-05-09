package Generic_Collections;

import java.util.ArrayList;

public class Collections {

	public static void main(String[] args) throws StackisEmptyException {
		// TODO Auto-generated method stub
		StackNew<Integer> stack = new StackNew<>();
		
		stack.add(1);
		stack.add(2);
		stack.add(3);
		System.out.println(stack.remove());
		System.out.println(stack.remove());
		System.out.println(stack.remove());
		System.out.println(stack.remove());
		
	}

}

class StackNew<T>{
	ArrayList<T> arr;
	static int index=-1;
	public StackNew() {
		arr = new ArrayList<T>();
			
	}
	public void add(T data) {
		index++;
		arr.add(data);
		
	}
	
	public T remove() throws StackisEmptyException {
		if(!isEmpty()) {
		T val =(T) arr.remove(index);
		index--;
		
		return val;
		}
		else {
			throw new StackisEmptyException("Stack is empty");
		}
	}
	
	public boolean isEmpty() {
		
		if(arr.isEmpty()) {
			return true;
		}
		return false;
	}
	
	
}

