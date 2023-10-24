package javaprgms;

public class Pangram {
	public static void main(String[] args) {		   
		    String sentence = "Pack my box with five dozen liquor jugs";
	        boolean isPangram = checkIfPangram(sentence);
		    System.out.println(isPangram);
		    }
		    public static boolean checkIfPangram(String s) {
		        boolean[] alphabetPresent = new boolean[26];
		        int count = 0;

		        for (int i = 0; i < s.length(); i++) {
		            char ch = s.charAt(i);
		            if (Character.isLetter(ch)) {
		                if (!alphabetPresent[Character.toLowerCase(ch) - 'a']) {
		                    alphabetPresent[Character.toLowerCase(ch) - 'a'] = true;
		                    count++;
		                }
	            }
	        }
	        return count == 26;
		    }
	}


