package prob5;

public class Prob5 {

	public static void main(String[] args) {
		for(int i = 1; i <= 99; i++) {
			String s = String.valueOf(i);
			char[] sArr = s.toCharArray();

			if(isContains(sArr)) {
				System.out.print(s + " ");
					
				for(char b : sArr) {
					if(b == '3' || b == '6' || b == '9') {
						System.out.print("짝");
					}
				}
					
				System.out.println();
			}
		}
	}
	
	private static boolean isContains(char[] arr) {
		for(char a : arr) {
			if(a == '3' || a == '6' || a == '9') {
				return true;
			} 
		}
		return false;
	}
}
