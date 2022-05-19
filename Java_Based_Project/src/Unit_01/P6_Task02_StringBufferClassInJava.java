package Unit_01;

public class P6_Task02_StringBufferClassInJava {
public static void main(String[] args) {
		
		
		StringBuffer sb=new StringBuffer("Namaste..!");
		sb.append("Sir");
		System.out.println(sb.charAt(0));
		
		System.out.println(sb);
		
		StringBuffer sb2=new StringBuffer("HJava");
		sb2.insert(1, "ello");
		System.out.println(sb2);
		
		StringBuffer sb3=new StringBuffer("GraEra");
		sb3.replace(1,3, "raphic");
		
		StringBuffer sb4=new StringBuffer("Uhgniversity..!");
		sb4.delete(1, 3);
		System.out.println(sb4);
		
			

	}

}
