import java.util.Arrays; 
public class bai12 {
  public static void main(String[] args) 
    {
        int[] mang = {1, 2, 5, 5, 6, 6, 7, 2};
 
        for (int i = 0; i < mang.length-1; i++)
        {
            for (int j = i+1; j < mang.length; j++)
            {
                if ((mang[i] == mang[j]) && (i != j))
                {
                    System.out.println("Duplicate Element : "+mang[j]);
                }
            }
        }
    }    
}