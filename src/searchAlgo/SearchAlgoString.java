package searchAlgo;

public class SearchAlgoString {
	
	//Brute force search for String 
	int BruteForceSearch(String text, String pattern) {
		return BruteForceSearch(text.toCharArray(), pattern.toCharArray());
	}
	
	int BruteForceSearch(char[] text, char[] pattern) {
		int i =0;
		int j = 0;
		final int n = text.length;
		final int m = pattern.length;
		
		while(i<=n-m) {
			j=0;
			while(j<m && pattern[j]==text[i+j])
				j++;
			if(j==m)
				return i;
			i++;
		}
		return -1;
	}

}
