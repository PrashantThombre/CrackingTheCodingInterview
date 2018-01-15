package chapter1;

import java.util.Arrays;

public class B_CheckPermutations {

	public void myCheckPermutations(){
		String str1 = "abcd.bbc";
		String str2 = "bcc.bbda";
		
		char[] chars1 = str1.toCharArray();
		Arrays.sort(chars1);
		String sorted1 = new String(chars1);
		
		char[] chars2 = str2.toCharArray();
		Arrays.sort(chars2);
		String sorted2 = new String(chars2);
		if(sorted1.equals(sorted2)){
			System.out.println("Permutation Revealed..!");
		}
		else{
			System.out.println("No Permutation Found..!");
		}
	}
}
