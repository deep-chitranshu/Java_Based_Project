package Unit_01;

public class P6_Task03_StringInJava {
	public static void main(String[] args) {
		
		 StringInJava obj = new StringInJava();
		 obj.StringDefiniton();
		 obj.charAnsString();
		
	}

}

class StringInJava { 
	void StringDefiniton() {
		
		String s = "Greetings of the Day Sir..!";
		String s1 = new String("How are you Sir..?");
		System.out.println(s);
		
		System.out.println(s.length());
		
		for(int i = 0; i < s.length(); i++) {
		
			System.out.println(s.charAt(i));
		}
		String first = "Dont";
		String second = "Offend";
		
		String third = first + second;
		System.out.println(third);
		
		boolean result1 = first.equals(second);
		System.out.println(result1);
		
		String fourth = "Thank You..!";
		String fifth = new String( "Sir..!");
		
	}
	
	void charAnsString() {
		
		char[] ch = {'H', 'o', 'w', 'a', 'r', 'e', 'y', 'o', 'u', '.', '.', '?'};
		char[] ch2 = {'S', 'i', 'r', '!'};
		
		System.out.println(ch);
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i]);
		}
		String s1 = new String(ch);
		System.out.println(s1);
			
			ch [0] = 'h';
			
			s1 = s1 + 'a';
			
			String s2 = "Deep";
			char[] ch4 = s2.toCharArray();
			
			char[] a2 = { 'C', 'h', 'i', 't', 'r', 'a', 'n', 's', 'h', 'u'};
			String s3 = new String(a2);
			
		}
}
