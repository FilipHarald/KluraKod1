package other;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;


public class MD5 {
	public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
		String theString = "aaabccddee";
//		String theString = "cca";
		MessageDigest md = MessageDigest.getInstance("MD5");
		StringBuilder sb = new StringBuilder("");
		boolean found = false;
		int count = 0;
		while(!found){
//			if(count == 10){
//				break;
//			}
//			System.out.println("||||||||||||");
			count++;
			byte[] bytesOfMessage = ("" + count).getBytes("UTF-8");
			byte[] theDigest = md.digest(bytesOfMessage);
			String hexString = "";
			for(int a = 0; a < theDigest.length; a++){
				String anotherTemp = Integer.toHexString(0xFF & theDigest[a]);
				if(anotherTemp.length() == 1){
					hexString += "0";
				}
				hexString = hexString + anotherTemp;
			}
			int currIndex = 0;
			int lengthCounter = 0;
//			System.out.println(hexString);
			for(int i = 0; i < theString.length(); i++){
				int temp = hexString.indexOf(theString.charAt(i), currIndex);
//				System.out.println(temp);
				if(temp >= 0){					
					currIndex = temp + 1; 
					lengthCounter++;
//					// OBS! "abc" finns inte i "abbc" 
				}
				if(lengthCounter == theString.length()){
					found = true;
					break;
				}
			}
		}
		System.out.println(count);
	} 
}
