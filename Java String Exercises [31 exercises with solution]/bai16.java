package Java_31;

public class bai16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        String str="This is a sample String ";
        byte[] byte_arr=str.getBytes();
        String new_arr=new String(byte_arr);
        System.out.println(" The new string equals "+new_arr);
        
	}

}
