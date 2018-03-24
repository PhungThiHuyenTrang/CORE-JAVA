import java.util.Scanner;
public class Bai1 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print ("Nhap so:");
    int so= in.nextInt();
    if (so>0)
    {
      System.out.println ("So vua nhap la so duong");
    }
    else if (so<0)
    {
      System.out.println ("So vua nhap la so am");
    }
    else
    {
      System.out.println ("So vua nhap la so 0");
    }
 }
}
