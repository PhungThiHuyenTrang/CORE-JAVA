import java.util.Arrays; 
public class bai1 {
public static void main(String[] args){   
    
    int[] chuoi1 = {
            1789, 2035, 1899, 1456, 2013, 
            1458, 2458, 1254, 1472, 2365, 
            1456, 2165, 1457, 2456};
            
    String[] chuoi2 = {
            "Java",
			
            "Python",
            "PHP",
            "C#",
            "C Programming",
            "C++"
        };        
    System.out.println("Day so ban dau : "+Arrays.toString(chuoi1));
    Arrays.sort(my_array1);
    System.out.println("Day so sau khi sap xep : "+Arrays.toString(chuoi1));
    
    System.out.println("Day so ban dau : "+Arrays.toString(chuoi2));
    Arrays.sort(my_array2);
    System.out.println("Phan loai chuoi mang : "+Arrays.toString(chuoi2));
    }
}