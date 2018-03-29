public class bai6 {
       public static int  timvitri (int[] mang, int t) {
        if (mang == null) return -1;
        int dem = mang.length;
        int i = 0;
        while (i < dem) {
            if (mang[i] == t) return i;
            else i=i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
      int[] mang = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};
      System.out.println("Vi tri cua so 25 la: " + timvitri(mang, 25));
      System.out.println("Vi tri cua so 77 la: " + timvitri(mang, 77));
       }
}
