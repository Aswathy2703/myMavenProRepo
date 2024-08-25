package stringbuilder;

public class String_Builder {

	public static void main(String[] args) {
//1. Append
		/*StringBuilder sb= new StringBuilder("Good");
		sb.append("Morning");
		System.out.println(sb);*/
		
//2. Insert
		/*StringBuilder sb= new StringBuilder("Happy");
		sb.insert(1,"Hai");
		System.out.println(sb);*/
//3. Replace()
		/*StringBuilder sb=new StringBuilder("Good");
		sb.replace(1, 3, "noo");
		System.out.println(sb);*/
//4. Delete()
		StringBuilder sb=new StringBuilder("Good");
		sb.delete(0, 2);
		System.out.println(sb);

	}

}
