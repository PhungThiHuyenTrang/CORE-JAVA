package Java_31;

import java.util.Calendar;

public class Bai15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Calendar c = Calendar.getInstance();
	      System.out.println("Hiển thị ngày và giờ hiện tại :"); 
	      System.out.format("%tB %te, %tY%n", c, c, c);
	      System.out.format("%tl:%tM %tp%n", c, c, c);
	}

}
