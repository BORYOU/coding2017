//: ArrayList.java
import java.util.*;

public class ArrayList{
	private int length = 0;
	private int maxSize;
	private Object[] arrayList;
	
	// Initial an ArrayList with max size
	public void initList (int size){
		if (size < 0){
			System.out.println("size should be bigger than 0");
		} else{
			this.length = 0;
			this.maxSize = size;
			this.arrayList = new Object[size];
		}
	}
	
	// find an object in the arraylist and return position, 
	// return -1 if not find
	public int findObj (Object obj){
		for (int i=0; i <= this.length; i++){
			System.out.println("finding index: " + i + " current object:" + this.arrayList[i]);
			if (this.arrayList[i] == obj){
				System.out.println("find object, index is: " + i);
				return i;
			}
		}
		System.out.println("object not find");
		return -1;
		
	}
		
	// delete object in arrayList, return true if deleted, 
	// return false if not find the object
	public boolean deleteObj(Object obj){
		for (int i = 0; i < this.length; i++){
			if (this.arrayList[i] == obj){
				int j = i;
				for (; j < this.length -1; j++)
					this.arrayList[j] = this.arrayList[j+1];
				this.arrayList[j] = null;
			return true;
			}
		}
		return false;
	}
				
				
	
}
