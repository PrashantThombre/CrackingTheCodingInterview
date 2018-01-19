package chapter1;

public class C_URLify {

	
	// In Place Changes Using a Char Array
	public void myCharURLify(){
		String str = "Mr. Prashant Thombre    ";
		int trueLength = 20;//--> Length of the string excluding the extra spaces only at the end.
		int spaceCount = 0;
		//Could have specified the character array directly-
		//-just didn't want to type that much..
		char[] charArr = str.toCharArray();
		//Get the number of total true spaces
		for(int i = 0 ; i < trueLength ; i++){
			if(charArr[i] == ' '){
				spaceCount++;
			}
		}
		
		int spaces_left = spaceCount;
		for(int i = (trueLength + spaceCount*2)-1 ; i>=0 ;i-- ){
			if(charArr[i-spaces_left*2]==' '){
				spaces_left--;
				charArr[i-2] = '%';
				charArr[i-1] = '2';
				charArr[i] = '0';
				i = i - 2;
			}
			else{
				charArr[i] = charArr[i - spaces_left*2];
			}
		}
		System.out.println(new String(charArr));
	}
	
	//Simpler using a new string to store the url
	public void myStrUrLify(){
		String str = "Mr. Prashant Thombre";
		String [] strArr = str.split(" ");
		String url = strArr[0];
		for(int i = 1 ; i <= strArr.length - 1 ; i++){
			url += "%20" + strArr[i];
		}
		System.out.println(url);
	}
}