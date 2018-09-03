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
	
	//Robin karp algorithm
	int RobinKarp(String text, String pattern) {
		return RobinKarp(text.toCharArray(), pattern.toCharArray());
	}
	
	int RobinKarp(char[] text, char[] pattern) {
		int n = text.length;
		int m = pattern.length;
		int i,j;
		int prime = 101;
		int powm = 1;
		int textHash = 0, patternHash = 0;
		
		if(m==0||m>n)
			return -1;
		for(i=0;i<m-1;i++)
			powm = (powm<<1)%prime;
		
		for(i=0;i<m;i++) {
			patternHash = ((patternHash<<1)+pattern[i])%prime;
			textHash = ((textHash<<1)+text[i])%prime;
		}
		for( i=0;i<=(n-m);i++) {
			if(textHash == patternHash) {
				for (j = 0; j < m; j++) {
					if (text[i+j] != pattern[j])
						break;
				}
				if (j == m)
					return i;
			}
			textHash = (((textHash-text[i]*powm)<<1)+text[i+m])%prime;
			if (textHash < 0)
				textHash = (textHash + prime);
		}
		return -1;
	}
}
