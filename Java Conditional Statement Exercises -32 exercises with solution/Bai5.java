import java.util.Scanner;
public class Bai5 {

    
  public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Nhap vao so: ");
        int ngay = in.nextInt();

        System.out.println(getDayName(ngay));
    }

    // Get the name for the Week
    public static String getDayName(int ngay) {
        String dayName = "";
        switch (ngay) {
            case 1: dayName = "Thứ hai";
            break;
            case 2: dayName = "Thứ ba";
            break;
            case 3: dayName = "Thứ tư";
            break;
            case 4: dayName = "Thứ năm";
            break;
            case 5: dayName = "Thứ sáu";
            break;
            case 6: dayName = "Thứ bảy";
            break;
            case 7: dayName = "Chủ nhật";
            break;
            default:dayName = "So nhap vao khong hop le.";
        }

        return dayName;
    }
}
