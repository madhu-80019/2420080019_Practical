package myproject2;

public class string_example {
	public static void main(String args []) {
		String str="hello this is java class";
		String str1="hello";
		String str2="HELLO";
		String str3="hi how are you";
		String str4="hello";
		String str5="1234";
		String str6="java234";
		String str7="";
		String str8="   hello java   ";
		System.out.println(str8.length()); //int
		System.out.println(str.toUpperCase()); //str
		System.out.println(str.toLowerCase()); //str
		System.out.println(str3.charAt(13)); //str
		System.out.println(str1.compareTo(str4)); //int
		System.out.println(str1.compareToIgnoreCase(str2));  //int
		System.out.println(str1.concat(str3)); //str
		System.out.println(str1.contains("le")); //boolean
		System.out.println(str1.contentEquals(str2)); //boolean
		System.out.println(str1.endsWith("ooo")); //boolean
		System.out.println(str1.equals(str8)); //boolean
		System.out.println(str.indexOf("l")); //first ocurrence   
		System.out.println(str1.matches("[0-9]+")); //boolean
		System.out.println(str7.matches("\\d+")); //matches all digits
		System.out.println(str6.matches("[0-9a-z]")); //boolean
		System.out.println(str7.isEmpty()); //boolean
		System.out.println(String.join("|",str2,str3,str4)); //concatenates with gap seperator
		System.out.println(str3.lastIndexOf("l")); //last occurrence
		System.out.println(str1.replace("l", "p")); //str
		System.out.println(str1.replaceFirst("hello", "mo")); //str
		String str81[]=str3.split(" ");
		for (String i:str81)
		{
			System.out.println(i);
		}
		System.out.println(str6.startsWith("J")); //takes de-limiter as the parameter and separates the words with that
		System.out.println(str8.trim()); //removes gaps before and after
		String str10="hi;how;are;you";
		//String str8[]=str10.split(";");
		//for (String i:str8);
		//{
		//	System.out.println(i);
		//}
	
	
	}
}
