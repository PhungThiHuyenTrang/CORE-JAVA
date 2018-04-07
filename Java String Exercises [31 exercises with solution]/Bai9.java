package Java_31;

public class Bai9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="Java String1";
         String str2="Java string2";
         CharSequence cs= "Java String1";
         System.out.println("So sanh"+str1+"và"+cs+":"+str1.contentEquals(cs));
         System.out.println("So sanh"+str2+"và"+cs+":"+str2.contentEquals(cs));
	}    

}
