package Java_31;

public class Bai12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Java exercise";
        String str2= "Java exercises";
        String str3= "es";
        boolean kthuc1= str1.endsWith(str3);
        boolean kthuc2=str2.endsWith(str3);
        System.out.println("\""+str1+ "kêt thúc bởi"+"\""+ str3+ "\""+kthuc1);
        System.out.println("\""+str2+ "kêt thúc bởi"+"\""+ str3+ "\""+kthuc2);
	}

}
