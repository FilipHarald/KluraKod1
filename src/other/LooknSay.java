package other;

public class LooknSay {
	public static void main(String[] args) {
		String theNbr = "11";
		for(int i = 0; i <= 9; i++){
			System.out.println("ITERATION:::::::  " + i);
			theNbr = lookNSay(theNbr);
		}
	}
	
	private static String lookNSay(String nbr) {
		char[] temp = nbr.toCharArray();
		String s = "";
		int counter = 1;
		
		System.out.println(temp);
		System.out.println(temp.length);
		
		for(int i = 0; i < temp.length; i++){
			if(i == temp.length - 1){
				s = s + counter + temp[i];
				counter = 1;
			}else{
				
				if(temp[i] == temp[i+1]){
					counter++;
				}else{
					s = s + counter + temp[i];
					counter = 1;
				}
			}
		}
		System.out.println(s);
		return s;
	}
}

