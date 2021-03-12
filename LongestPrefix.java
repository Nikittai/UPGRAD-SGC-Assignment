

import java.util.*;

public class LongestPrefix {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String arg = sc.next();
		List<String> list = new ArrayList();
		int start=0;
		for(int i=0;i<arg.length();i++) {
			if(arg.charAt(i) == '[' || arg.charAt(i)==',') {
				start = i+2; 
				i++;
			}
			else if(arg.charAt(i)=='\"') {
				list.add(arg.substring(start,i));
			}
		
		}
	    if(list.size()==0) {
	    	return;
	    }
	
		findLongestPrefix(list);
				 
	}
	public static void  findLongestPrefix(List<String> list) {
		int i=0;
		StringBuilder str = new StringBuilder();
		//Looping over the list
		while(i<list.get(0).length()) {
			char ch = list.get(0).charAt(i);
			//For checking same char in all the strings present in the list
			for(String arg : list) {
				
				if(i >= arg.length() || arg.charAt(i) != ch) {
					System.out.println("\""+str+"\"");
					return;
				}
			
			}
			str.append(ch); 
			i++;
		}
		System.out.println("\""+str+"\"");
		return;
		
	}
	
}
