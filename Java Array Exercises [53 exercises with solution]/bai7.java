import java.util.Arrays; 
public class bai7 {
 
public static void main(String[] args) {
   int[] mang = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
   
   System.out.println("Mang dau tien : "+Arrays.toString(mang));     
   
   int removeIndex = 1;

   for(int i = removeIndex; i < my_array.length -1; i++){
        my_array[i] = my_array[i + 1];
      }
    System.out.println("Sau khi loai bo phan tu thu hai: "+Arrays.toString(mang));
 }
 }
