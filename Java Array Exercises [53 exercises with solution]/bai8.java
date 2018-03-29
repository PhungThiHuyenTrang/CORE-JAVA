import java.util.Arrays; 
public class bai8 {
 public static void main(String[] args) {
   int[] mang = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   int[] mang1 = new int[10];     
 
   System.out.println("mang dau tien : "+Arrays.toString(mang));     
   
   for(int i=0; i < mang.length; i++) {
    mang1[i] = mang[i];
}
   System.out.println("Mang moi: "+Arrays.toString(mang1));
 }
 }