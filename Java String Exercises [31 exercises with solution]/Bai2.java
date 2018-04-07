package Java_31;

import java.lang.Character.UnicodeBlock;

public class Bai2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="Lap trinh huong doi tuong";
        System.out.println("Mang ban da nhap la"+str);
        int kitu1=str.codePointAt(1);
        int kitu2=str.codePointAt(10);
        System.out.println("Ki tu thu 1 la(Unicode point)"+kitu1);
        System.out.println("Ki tu thu 10 la(Unicode point)"+kitu2);

		
        
	}

}
