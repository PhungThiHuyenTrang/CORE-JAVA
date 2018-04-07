package Java_31;

public class Bai14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Bài tập java cơ bản ";
        String str2="lập trình hướng đối tượng ";
        String str3="Lập trình hướng đối tượng ";
        boolean ss1= str2.equalsIgnoreCase(str1);
        boolean ss2= str2.equalsIgnoreCase(str3);
        System.out.println("\""+str2+ "có bằng "+str2+ "đúng hay sai\""+ss1);
        System.out.println("\""+str2+ " có bằng "+str3+ "đúng hay sai\""+ss2);
	}

}
