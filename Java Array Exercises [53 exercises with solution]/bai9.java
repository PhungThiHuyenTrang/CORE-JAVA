import java.util.Arrays; 
public class bai9 {
 
public static void main(String[] args) {

   int[] mang = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

   
   int giatridau = 2;
   int giatrimoi  = 5;

  System.out.println("mang dau tien : "+Arrays.toString(mang));     
   
  for(int i=mang.length-1; i > giatrimoi; i--){
    mang[i] = mang[i-1];
   }
   mang[giatrimoi] =giatrimoi ;
   System.out.println("mang moi: "+Arrays.toString(mang));
 }
 }
 