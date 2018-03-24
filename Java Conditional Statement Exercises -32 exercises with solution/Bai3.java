import java.util.Scanner;
public class Bai3 {

    
  public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

            System.out.print("Nhap so a: ");
            int a = input.nextInt();
            System.out.print("Nhap so b: ");
            int b = input.nextInt();
            System.out.print("Nhap so c: ");
            int c= input.nextInt();
           if (a > b)
   if (a > c)
    System.out.println("So lon nhat la: " + a);
   
  if (b > a)
   if (b > c)
    System.out.println("So lon nhat la: " + b);
   
  if (c > a)
   if (c > b)
    System.out.println("So lon nhat la: " + c);
 }
}
