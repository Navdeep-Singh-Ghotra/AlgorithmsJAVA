package sortingAlgo;

public class SearchAlgo {
	
	// searching element in unsorted array
	boolean linearSearchunsorted(int[] arr, int size, int value) {		
		int i=0;
		for (i=0;i<size;i++) {
			if(value == arr[i])
				return true;
		}
		return false;
	}
	
	// searching element in sorted array
	boolean linearSearchSorted(int[] arr, int size, int value) {		
		int i=0;
		for (i=0;i<size;i++) {
			if(value == arr[i])
				return true;
			else if(value < arr[i])
				return false;
		}
		return false;
	}
	
}
