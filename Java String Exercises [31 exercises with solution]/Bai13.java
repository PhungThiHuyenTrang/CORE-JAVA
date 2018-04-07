package Java_31;

public class Bai13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="Bài tập java cơ bản ";
        String str2="lập trình hướng đối tượng ";
        String str3="bài tập java cơ bản ";
        boolean ss1= str1.equalsIgnoreCase(str2);
        boolean ss2= str1.equalsIgnoreCase(str3);
        System.out.println("\""+str1+ "có bằng "+str2+ "đúng hay sai\""+ss1);
        System.out.println("\""+str1+ " có bằng "+str3+ "đúng hay sai\""+ss2);
	}

}
