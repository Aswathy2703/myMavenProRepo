package stringbuffer;

public class String_Buffer {

	public static void main(String[] args) {
		/*string buffer class is used to create mutable(modifiable)string'
		string builder is faster compare to string buffer.*/
		//append 
		//
		//1. Append()-- - to join two words
	/*	StringBuffer sb=new StringBuffer("Hello");
		sb.append("World");
		System.out.println(sb);*/
		
	//	2. insert() -- insert the given string with the string at the given position
	/*StringBuffer sb=new StringBuffer("Hello");
	sb.insert(1,"Java");// insert java in first index
	System.out.println(sb);*/
	
	
	//3. replace()- the replace method replace the given string from the specified begin index and end index
/*	StringBuffer sb=new StringBuffer("Hello");
	sb.replace(1, 3, "World");
	System.out.println(sb);*/
		
	//	4. Delete()--delete a string from the specified begin index and end index
	/*	StringBuffer sb=new StringBuffer("Hello");
		sb.delete(1, 3);
		System.out.println(sb);*/
		
		//5.reverse()-- reverse the given string
		StringBuffer sb=new StringBuffer("Hello");
		sb.reverse();
		System.out.println(sb);
	}

}
