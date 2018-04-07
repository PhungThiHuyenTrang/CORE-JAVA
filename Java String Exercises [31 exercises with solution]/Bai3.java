package Java_31;

public class Bai3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="Phung thi huyen trang";
        System.out.println("Mang ban da nhap la:"+str);
        int kitu1=str.codePointBefore(1);
        int kitu2=str.codePointBefore(10);
        System.out.println("ki tu thu nhat xuat hien(unicode before)"+kitu1);
        System.out.println("ki tu thu nhat xuat hien(unicode before)"+kitu2);
	}

}
