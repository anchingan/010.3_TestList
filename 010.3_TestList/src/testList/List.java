package testList;

public class List {
	protected int[] intArray;
	protected int count;
	
	public List() {
		intArray = new int[3];
		count = 0;
	}
	
	public List(int i) {
		this();
		intArray = new int[i];
	}
	
	//Add new value at the end of array and return true if success else return false.
	boolean add(int x){
		if (count >= this.intArray.length) {
			int[] temp = new int[count * 2];
			System.arraycopy(this.intArray, 0, temp, 0, count);
			this.intArray = null;
			this.intArray = temp;
		}
		intArray[count++] = x;
		return true;
	}
	
	//Delete all value x in array, move all space to the end and return true if success else return false.
	boolean remove(int x){
		int time = 0;
		for (int i = 0; i < count; i++) {
			if (intArray[i] == x) {
				time++;
				for (int j = i; j < count - 1; j++) 
					intArray[j] =intArray[j + 1];
				count--;
				i--;
			}
		}
		if (time!= 0)
			return true;
		return false;
	}
	
	public String toString() {
		String a = " ";
		for (int i = 0; i < count; i++)
			a += intArray[i] + " ";
		return a;
	}


}
