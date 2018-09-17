package lab7_4.dividesort;

import lab7_2.MinSort;

public class DivideSort {

	String divideSort(String s) {
		if(s.length() <= 1)
			return s;
		int len = s.length();
		int mid = len/2;
		
		String sleft = sort(s.substring(0, mid - 1));
		String sright = sort(s.substring(mid, len));
		
		return new Merge().merge(sleft, sright);
	}
	
	String sort(String input) {
		if(input == null || input.length() ==0)
			return null;
		if(input.length() == 1)
			return input;
		
		int minPos=0;
		char[] charArr = input.toCharArray();
		char ch = charArr[0];
		
		for(int i=0; i< charArr.length; ++i) {
			if(charArr[i] < ch){
				minPos = i;
				ch=charArr[i];
			}
		}
		
		char min = charArr[minPos];
		charArr[minPos] = charArr[0];
		String partial = new String(charArr);
		
		return min + sort(partial.substring(1));
	
	}
	
	public static void main(String[] args) {
		DivideSort ms = new DivideSort();
		String result = ms.divideSort("zwxuabfkafutbbbb");
		System.out.println(result);
	}

}
