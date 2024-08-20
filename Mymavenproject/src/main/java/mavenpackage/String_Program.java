package mavenpackage;

public class String_Program {

	public static void main(String[] args) {
		// methods
		//1. length
		/*String s1= "Hello World";
		 System.out.println(s1.length());*/
		
		
		// 2. contains (check whether the statement has 
	/*	String s2="Java is a programming language";
		System.out.println(s2.contains("Java is"));
		System.out.println(s2.contains("java is"));
		System.out.println(s2.contains("Java python"));*/
		
		
		//3.isEmpty method
	/*	String s3="";
				String s4="Hello World";
				System.out.println(s3.isEmpty());
		System.out.println(s4.isEmpty());*/
		
		
		//4. equals--case sensitive
		/*String s1="Java";
		String s2="java";
		String s3="Python";
				String s4="Python";
				System.out.println(s1.equals(s2));
				System.out.println(s2.equals(s3));
				System.out.println(s3.equals(s4));*/
				
				
	//5. toLowerCase ---result in lower case
		/* String s1="Java is a programming language";
		System.out.println(s1.toLowerCase());*/
		
		
		//6. toUpperCase ---result in upper case
				/*String s1="Java is a programming language";
				System.out.println(s1.toUpperCase());*/
				
				//7. equalsIgnoreCase -- check only content
			/*	String s1="Java";
				String s2="java";
				String s3="Python";
						String s4="Python";
						System.out.println(s1.equalsIgnoreCase(s2));
						System.out.println(s2.equalsIgnoreCase(s3));
						System.out.println(s3.equalsIgnoreCase(s4));*/
		
		//8.replace
		/*String s1= "Java is Simple";
		//System.out.println(s1.replace('a', 'e'));
		System.out.println(s1.replace("Java", "Python"));*/
	
	//9.trim
	/*String s1=" India is my country ";
	System.out.println(s1.trim());*/
	
	//10. startsWiths or endsWith
	String s1= "Java is powerful";
	System.out.println(s1.startsWith("ja"));
	System.out.println(s1.startsWith("JA"));
	System.out.println(s1.startsWith("is"));
	
	System.out.println(s1.endsWith("ful"));
	System.out.println(s1.endsWith("full"));
	
	
	
	}

}
