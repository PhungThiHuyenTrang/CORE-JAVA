public class bai4 {
public static void main(String[] args) {   
 
       int[] so = new int[]{20, 30, 25, 35, -16, 60, -100};
       int S = 0;
       for(int i=0; i < so.length ; i++)
        S = S + so[i];
        double TBC = S / so.length;
        System.out.println("Trung binh cong cac so trong mang : " + TBC);
   }
}