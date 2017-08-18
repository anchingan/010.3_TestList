package testList;

public class AdvancedSearchList extends SearchList {
	//Arrange the elements in order of small to large.
	void sort() {
		int k = this.count - 1, times = 0, temp;
		while (k != 0) {
			times = 0;
			for (int i = 0; i < k; i++) {
				if (this.intArray[i] > this.intArray[i + 1]) {
					temp = this.intArray[i];
					this.intArray[i] = this.intArray[i + 1];
					this.intArray[i + 1] = temp;
					times = i;
				}
			}
			k = times;
		}
	}
	
	//Search x using binary search, return index if this value is exist else return -1.
	int search(int x) {
		this.sort();
		int left = 0, right = this.count, index, temp;
		for (int i = 0; i < this.count; i++) {
			index = (left + right) / 2;
			temp = this.intArray[index];
			if (temp == x)
				return index;
			else if (temp < x)
				left = index + 1;
			else
				right = index - 1;
		}
		return -1;
	}
	
	//Remove element of given index and move the space to the end.
	boolean remove(int index) {
		if (index >= this.count || index < 0)
			return false;
		else {
			for (int i = index; i < count - 1; i++) 
				this.intArray[i] = this.intArray[i + 1];
			count--;
			return true;
		}
	}
	
	//Remove first num of x, remove all x if num is -1.
	boolean remove(int x, int num) {
		if (super.search(x) == -1)
			return false;
		if (num == -1) {
			super.remove(x);
			return true;
		}
		for (int i = 0; i < count && num != 0; i++) {
			if (this.intArray[i] == x) {
				for (int j = i; j < count - 1; j++)
					this.intArray[j] = this.intArray[j + 1];
				i--;
				num--;
				count--;
			}
		}
		return true;
	}


}
