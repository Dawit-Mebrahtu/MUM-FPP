package lab7_3_binary_search;

public class BinSearch {

	public boolean search(String s, char c) {
		if(s == null || s.length() == 0)
			return false;
		
		int middle = s.length()/2;
		if(c == s.charAt(middle))
			return true;
		if(c < s.charAt(middle))
			return search(s.substring(0, middle), c);
		if(c > s.charAt(middle))
			return search(s.substring(middle + 1, s.length()), c);
		
		return false;
	}
	public static void main(String[] args) {
		BinSearch bs = new BinSearch();
		System.out.println(bs.search("abcde", 'f'));
		System.out.println(bs.search("abcdefghijklm", 'a'));

	}

}
