package testList;

public class SearchList extends List {
	//Return index if value x is in the array, else return -1.
	int search(int x){
		for (int i = 0; i < this.count; i++) {
			if (this.intArray[i] == x)
				return i;
		}
		return -1;	
	}
	
	//Return maximum value in the array.
	int findMax(){
		int max = this.intArray[0];
		for (int i = 1; i < this.count; i++) {
			if (this.intArray[i] > max)
				max = this.intArray[i];
		}
		return max;
	}
	
	//Replace all x to y in the array.
	boolean replace(int x, int y){
		boolean result = false;
		for (int i = 0; i < this.count; i++) {
			if (this.intArray[i] == x) {
				this.intArray[i] = y;
				result = true;
			}
		}
		return result;
	}

}
