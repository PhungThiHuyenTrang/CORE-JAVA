package Java_31;

public class Bai17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="This is the sample string";
		char[] mang= new char[]{ ' ', ' ', ' ', ' ',' ', ' ', ' ', ' ' };
		str.getChars(4, 10, mang, 2);
		System.out.println("the char array equals"+mang+"\"");

	}

}
