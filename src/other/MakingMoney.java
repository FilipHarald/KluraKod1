package other;

public class MakingMoney {
	public static void main(String[] args) {
		int counter = 0;
		for (int a = 0; a <= 100; a += 50) {
			for (int b = 0; b <= 100; b += 20) {
				for (int c = 0; c <= 100; c += 10) {
					for (int d = 0; d <= 100; d += 5) {
						for (int e = 0; e <= 100; e++) {
							int eSum = a + b + c + d + e;
							if (eSum == 100) {
								counter++;
							}
						}
//						int dSum = a + b + c + d;
//						if (dSum == 100) {
//							counter++;
//						}
					}
//					int cSum = a + b + c;
//					if (cSum == 100) {
//						counter++;
//					}
				}
//				int bSum = a + b;
//				if (bSum == 100) {
//					counter++;
//				}
			}
//				int aSum = a;
//				if (aSum == 100) {
//					counter++;
//				}
			}

		System.out.println(counter);
		}
	}

