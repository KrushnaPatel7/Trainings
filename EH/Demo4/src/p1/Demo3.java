package p1;

public class Demo3 {
	public static void main (String args[]) {
		String s1="Krushna";
		String s2="Krushna";
		String s3=new String("Krushna");
		String s4=new String("Krushna");
		System.out.println(s1==s2);//true
		System.out.println(s1==s3);//false
		System.out.println(s3==s4);//false //checks memory location
		System.out.println(s3.equals(s4));//true //checks only content
		
		String s5=new String("krushna");
		System.out.println(s5.equals(s4));//false
	System.out.println(s5.equalsIgnoreCase(s4));
	s1.concat("Patel");
	System.out.println(s1);
	
	StringBuffer sb =new StringBuffer("Krushna");
	sb.append("patel");
	System.out.println(sb);
	}
	
}
