package themes;

import java.util.Comparator;


public class NumberedFileComparator implements Comparator<Object> {
//taken from http://answers.yahoo.com/question/index?qid=20090616170823AAPtPWG
	
	//final int CHARS_BEFORE_NUMS = 30;
	
	public int compare(Object o1, Object o2) {
		String f1 = (String)o1;
		String f2 = (String)o2;
		int val = f1.compareTo(f2);
		if (val != 0){
			//String number1 = f1.substring(CHARS_BEFORE_NUMS, (f1.length() - 4) );
			//String number2 = f2.substring(CHARS_BEFORE_NUMS, (f1.length() - 4) );
			int int1 = Integer.parseInt(f1);
			int int2 = Integer.parseInt(f2);
			val = int1 - int2;
		}
		return val;
	}
}