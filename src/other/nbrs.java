package other;

import org.omg.Messaging.SyncScopeHelper;

public class nbrs {
	public static void main(String[] args) {
		int sum = 0;
		for(int i = 0 ; i < 1000; i++){
			if(i % 3 == 0){
				sum += i;
				
			}else if(i % 7 == 0){
				sum += i;
				
			}
		}
		System.out.println(sum);
	}
}
