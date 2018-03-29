public class bai13 {
public static void main(String[] args) 
    {
        String[] mang = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
 
        for (int i = 0; i < mang.length-1; i++)
        {
            for (int j = i+1; j < mang.length; j++)
            {
                if( (my_array[i].equals(mang[j])) && (i != j) )
                {
                    System.out.println("Duplicate Element is : "+mang[j]);
                }
            }
        }
    }    
}
