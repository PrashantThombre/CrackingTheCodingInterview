package chapter1;

import java.util.HashMap;
import java.util.Map;

//If a string has all unique characters
public class A_IsUnique {


	public void myIsUnique(){
		String[] candidates = {"abcfds","non-unique","1234"};
		Boolean[] answers = new Boolean[candidates.length];
		int count = -1;
		for(String str : candidates){
			count++;
			answers[count] = true;
			Map<Character,Integer> characterMap = new HashMap<Character,Integer>();
			for(int i = 0 ; i < str.length() ; i++){
				if(characterMap.get(str.charAt(i))== null){
					characterMap.put(str.charAt(i), 1);
				}
				else{
					characterMap.put(str.charAt(i), characterMap.get(str.charAt(i)) + 1);
				}

			}
			
			for(Character key : characterMap.keySet()){
				if(characterMap.get(key) > 1 ){
					answers[count] = false;
					break;
				}
			}
			System.out.println(candidates[count]+" :\t"+answers[count]);
		}
	}

}
