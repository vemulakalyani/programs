package javaprgms;
import java.util.HashMap;
import java.util.Map;
    public class RomanNumerial {
    public static void main(String[] args) {
		        String romanNumeral = "IX";
	        int result = romanToInteger(romanNumeral);
		        System.out.println(result);
		    }	
		    public static int romanToInteger(String s) {
		        Map<Character, Integer> romanValues = new HashMap<>();
	            romanValues.put('I', 1);
		        romanValues.put('V', 5);
		        romanValues.put('X', 10);   
		        int total = 0;
		        int prevValue = 0;
	        for (int i = s.length() - 1; i >= 0; i--) {
		            int currentValue = romanValues.get(s.charAt(i));
	            if (currentValue < prevValue) {
	                total = total - currentValue;
		            } else {
		                total =total + currentValue;
		            }
		            prevValue = currentValue;
		        }	
		        return total;
	}

}
