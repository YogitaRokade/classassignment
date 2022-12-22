package arrayexamples;

public class StringConcat {
	public static void main(String []args)
	{
		String str1="Hello";
		String str2=" javastring";
		String str3=" reader";
		String str4=str1.concat(str2);
		System.out.println(str4);
		String str5=str1.concat(str2).concat(str3).concat(" hii");
		System.out.println(str5);
		
		//contains
		String name="what do you know about me";
		System.out.println(name.contains("do you know"));//true
		System.out.println(name.contains("about"));//true
		System.out.println(name.contains("hello"));
		
		//endsWith
		String s1="java by Monalisa mam";
		System.out.println(s1.endsWith("t")); //false
		
		System.out.println(s1.endsWith("mam")); //false
		
		//indexOf
		System.out.println(str1.indexOf('e'));  //true=1

	}

}
