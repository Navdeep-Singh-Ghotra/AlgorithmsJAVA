package sortingAlgo;

public class driver {

	public static void main(String[] args) {
		
		int[] Sample = {1,2,3,4,5,8,9};
		int size = Sample.length;
		
		int value = 2;
		
		SearchAlgo search = new SearchAlgo();
		
		System.out.println(search.linearSearchunsorted(Sample, size, value));
		System.out.println(search.linearSearchSorted(Sample, size, value));

	}

}
