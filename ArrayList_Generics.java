package Generic_Collections;

import java.util.List;

public class ArrayList_Generics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		New_ArrayList<Integer> arr= new New_ArrayList<>();
		arr.add(0);
		arr.add(1);
		arr.add(2);
		arr.add(3);
		arr.add(4);
		arr.add(5);
		System.out.println(arr.remove(3));
		arr.add(5);
		System.out.println(arr.remove(3));
		System.out.println(arr.remove(3));
		System.out.println(arr.remove(3));
		System.out.println(arr.remove(3)); //throws exception in this line
		
	}
	
	

}

class New_ArrayList<T> {
	private T[] arr;
	private int index=0;
	
	public New_ArrayList() {
		arr = (T[])new Object[5];
		//taking default size as 5
	}
	
	public void add(T element) {
	 if(index < arr.length) {
		arr[index] = element;
		index++;		
	}
	 else {
		 arr= double_size(arr);
		 add(element);
	 }	 
	}
	
	private T[] double_size(T[] arr2) {
		T[] new_Arr = (T[])new Object[2*arr2.length];
		System.out.println(2*arr2.length);
		for(int i=0;i<arr2.length;i++) {
			new_Arr[i] = arr2[i];
		}
		
		return new_Arr;
	}
	
	public T remove(int ind) throws ArrayIndexOutOfBoundsException {
		T ele = arr[ind];
		if(index > ind) {			
			
			for(int i=ind;i<arr.length-1;i++) {
				arr[i]=arr[i+1];
			}
		}else {
			throw new ArrayIndexOutOfBoundsException() ;
		}
		index--;
		return ele;		
	}	
	
	public T[] removeAll() {
		
		return (T[])new Object[arr.length];
	}
	
	public T get(int ind) {
		
		T ele = arr[ind];
		if(index > ind) {			
			return ele;		
		}else {
			throw new ArrayIndexOutOfBoundsException() ;
		}
				
	}
}

	