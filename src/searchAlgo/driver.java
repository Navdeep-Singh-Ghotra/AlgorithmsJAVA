package searchAlgo;

public class driver {

	public static void main(String[] args) {
		
		int[] Sample = {1,2,3,4,5,8,9};
		int size = Sample.length;
		
		int value = 7;
		
		SearchAlgoInt search = new SearchAlgoInt();
		SearchAlgoString searchPattern = new SearchAlgoString();
		
		//System.out.println(search.linearSearchunsorted(Sample, size, value));
		//System.out.println(search.linearSearchSorted(Sample, size, value));
		//System.out.println(search.binarySearch(Sample, size, value));
		//System.out.println(search.binarySearchRecursive(Sample, 0,3, value));
		
		System.out.println(searchPattern.BruteForceSearch("NavdeepSinghGhotra", "Singh"));

	}

}
