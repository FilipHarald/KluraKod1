package other;

public class EvenFib {
	public static void main(String[] args) {
		int prevNbr = 1;
		int nbr = 2;
		int sum = 0;
		int temp = 0;
		while(nbr <= 4000000){
			temp = nbr;
			nbr = prevNbr + nbr;
			prevNbr = temp;
			if (nbr % 2 == 0){
				sum += nbr;
			}
		}
		System.out.println(sum);
	}
}
