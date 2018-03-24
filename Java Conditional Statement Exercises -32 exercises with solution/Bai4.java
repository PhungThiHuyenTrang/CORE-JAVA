import java.util.Scanner;
public class Bai4 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Nhap vao so: ");
    double so = in.nextDouble();
    if (so>0)
    {
      System.out.println ("So ban vua nhap la so duong");
    }
    else if (so<0)
    {
     System.out.println ("So ban vua nhap la so am");
    }
    else {
      System.out.println ("Ban vua nhap so 0");
    }
 }
}