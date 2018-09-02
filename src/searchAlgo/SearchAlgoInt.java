package searchAlgo;

public class SearchAlgoInt {
	
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
	
	// binary search Iterative
	boolean binarySearch(int[] arr, int size, int value) {
		int low = 0;
		int high = size-1;
		int mid;
		
		while(low<=high) {
			mid = low + (high-low)/2;
			if(arr[mid] ==value)
				return true;
			else if(arr[mid]<value) 
				low = mid + 1;
				else
					high = mid - 1;
			}
		return false;
	}
	
	//binary serch recursive
	boolean binarySearchRecursive(int[] arr, int low, int high, int value) {
		if(low>high)
			return false;
		int mid = low + (high+low)/2;
		if(arr[mid]==value)
			return true;
		else if (arr[mid]<value)
			return binarySearchRecursive(arr, mid+1, high, value);
		else
			return binarySearchRecursive(arr, low, mid-1,value);
	}
	
}
