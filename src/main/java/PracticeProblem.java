public class PracticeProblem {
		public static void main(String args[]) {

	}
	
	public static int calculate(int num1, int num2, char operator) {
    switch (operator) {

        case '+':
            return num1 + num2;

        case '-':
            return num1 - num2;

        case '*':
            return num1 * num2;

        case '/':
            return num1 / num2;

        case '%':
            return num1 % num2;

        case '^':
            return (int) Math.pow(num1, num2);

        default:
            System.out.println("Invalid operator");
            return 0;
        }
    }   
	
   	public final static int MAXIMUM = 10;
	public static boolean totalWordsChecker(String str) {
    if (str.isEmpty()) {
        return true;
    }
    
    int count = 0;
    boolean inWord = false;
    
    for (int i = 0; i < str.length(); i++) {
        char c = str.charAt(i);
        
        if (c == ' ' || c == ',' || c == '/' || c == ';' || c == '-' || 
            c == '(' || c == ')' || c == '[' || c == ']' || 
            c == '{' || c == '}' || c == '<' || c == '>') {
            inWord = false;
		} else {
           	if (!inWord) {
               	count++;
               	inWord = true;
            	}
        	}
    	}
    
    	return count <= MAXIMUM;
	}
	
	public static String minString(String str1, String str2, String str3) {
		String lower1 = str1.toLowerCase();
		String lower2 = str2.toLowerCase();
		String lower3 = str3.toLowerCase();
		
		if (lower1.compareTo(lower2) <= 0 && lower1.compareTo(lower3) <= 0) {
			return str1;
		} else if (lower2.compareTo(lower1) <= 0 && lower2.compareTo(lower3) <= 0) {
			return str2;
		} else {
			return str3;
		}
	}

}


