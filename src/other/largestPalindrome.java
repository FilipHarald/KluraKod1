package other;

public class largestPalindrome {
	public static void main(String[] args) {
		int largestPal = Integer.MIN_VALUE;
		int nbr = 0;
		for(int stat = 999; stat > 99; stat--){
			
			for(int i = 999; i > 99; i--){
				nbr = stat*i;
				if(isPal(nbr)){
					if(largestPal<nbr){
						largestPal = nbr;
					}
				}
			}
		}
		System.out.println(largestPal);
	}

	private static boolean isPal(int nbr) {
		char[] one = ("" + nbr).toCharArray();
		char[] reverseOne = new char[one.length];
		for(int i = 0; i < one.length; i++){
			reverseOne[i] = one[one.length - i - 1];
		}
		boolean isPal = true;
		for(int j = 0; j < one.length; j++){
			if(reverseOne[j] != one[j] ){
				isPal = false;
			}
		}
		return isPal;
	}
}
