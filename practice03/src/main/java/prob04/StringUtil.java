package prob04;

public class StringUtil {

	public static String concatenate(String[] strArr) {
		String result = "";
		for(String a : strArr) {
			result += a;
		}
		return result;
	}
}
