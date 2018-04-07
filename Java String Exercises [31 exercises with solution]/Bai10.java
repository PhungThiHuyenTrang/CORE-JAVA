package Java_31;

public class Bai10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         String str1="Java String1";
         String str2="Java string2";
         StringBuffer strb= new StringBuffer(str1);
         System.out.println("So sanh"+str1+"và"+strb+":"+str1.contentEquals(strb));
         System.out.println("So sanh"+str2+"và"+strb+":"+str2.contentEquals(strb));
	}    

}
