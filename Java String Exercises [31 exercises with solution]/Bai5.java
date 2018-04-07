package Java_31;

public class Bai5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str1="java cơ bản 1";
        String str2="java cơ bản 2";
        System.out.println("Mảng 1: "+str1);
        System.out.println("Mảng 2: "+str2);
        int kq=str1.compareTo(str2);
        if (kq < 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " bé hơn " +
                "\"" + str2 + "\"");
        }
        else if (kq == 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " bằng " +
                "\"" + str2 + "\"");
        }
        else // if (result > 0)
        {
            System.out.println("\"" + str1 + "\"" +
                " lớn hơn " +
                "\"" + str2 + "\"");
        }	}

}
