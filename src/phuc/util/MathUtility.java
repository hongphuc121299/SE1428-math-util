/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuc.util;

/**
 *
 * @author ADMIN
 */
public class MathUtility {
    //Mình sẽ làm class này fake y chang calsss Math của JDK 
    // với các hàm static để xài chung cho mọi nơi 
    public static final double PI = 3.14;
    //hàm tính n! = 1.2.3..n
    //trong đó khong giai thừa âm, >20 tràn kiểu long
    //quy ước 0! = 1! = 1
    //Nếu đưa vào n âm, hoặc n>20, ta khong thèm tính
    public static  long getFactorial(int n){
        if(n<0 || n>30)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if(n==0 || n==1)
            return 1; //1 lệnh trong if không sài ngoặc
        //chỗ này tk nào sài else trừ điểm
        //ngay chỗ nay chinh là n = 2..20
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    
    //ta tự tin gáy hàm ta chạy ngon, chạy đúng
    //nhưng: team thì cần chứng minh điểu đó, bảo đảm chất lượng code, chất lượng hàm
    //muốn chứng minh hàm chạy đúng hay không ta cần test thử
    //ví dụ gọi hàm getFactorial(với các số khác nhau đưa vào)
    //getF(-5), getF(-1), getF(0), getF(5).....
    //các giá trị đầu vào đại diện cho vc sài hàm
    //ta còn gọi là test case, các tình huống cần test, các tình huống xài hàm
    //khi ta test hàm, ta cần quan tâm 2 vc
    //1. dự kiến hàm trả về giá trị gì khi hàm chạy với 1 đàu vào nào đó
    //   dự kiến hàm trả về giá trị, tui gọi là EXPECTED VALUE
    //   ví dụ : hàm sẽ trả về giá trị 120 khi gọi getF(5)
    //2. hàm khi chạy với 1 đầu vào nào đó, thì nó sẽ ói/return về 1 value
    
    //  NẾU TEST CHÍNH LÀ: SO SÁNH CÁI EXPECTED VALUE CÓ BẰNG VỚI ACTUAL VALUE HEM??
    //  NẾU CÓ BẰNG, HÀM ĐÚNG CHO CASE, TÌNH HUỐNG NÀY
    //  NẾU KO BẰNG, HÀM TÍNH TOÁN SAI, KÌ VỌNG SAI
    
    //HÀM MÀ TỐT THÌ PHẢI LÀ EXPECTED VALUE == ACTUAL, MỌI TÌNH HUỐNG
    //NẾU TỐT TA MỚI ĐEM RA XÀI, BÁN, PUBLIC CỘNG ĐỒNG
    
    //LÀM SAO ĐỂ TEST HÀM COI CÓ TỐT KHÔNG, EXPECTED  == ACTUAL
    //HAI KĨ THUẬT ĐƯỢC ÁP DỤNG
    //1. NHÌN BẰNG MATWSVAS SO SÁNH TỪNG CẶP EXPECTED VS ACTUAL
    //   KĨ THUẬT NÀY ĐƠN GIẢN, DỄ LÀM, NHƯNG MẮC SAI SÓT DO CÓ QUÁ NHIỀU CẶP
    //   EXPECTED ACTUAL CẦN SO SÁNH BẰNG MẮT
    //KĨ THUẬT 2: nhìn bằng mắt, không cần so sánh từng cặp
    public static void main(String[] args) {
        //case 1:
        long expected = 120; //tao hi vọng 120 ói về nếu
        long actual = MathUtility.getFactorial(5); //tao gọi hàm 5!
        System.out.println("5!!? expected: " + expected+ "; actual: " + actual);
        //đúng cho case đầu tiên
        
        //case 2:
        expected = 720; //tao hi vọng 720 ói về nếu
        actual = MathUtility.getFactorial(6); //tao gọi hàm 6!
        System.out.println("6!!? expected: " + expected+ "; actual: " + actual);
        //đúng cho case 2
        
        //case 3
        System.out.println("0!!? expected: 1" + expected+ "; actual: " + MathUtility.getFactorial(0));
        
        //case 4:
        //tao kì vọng nhận về IllegalArgumentException
        //nếu t gọi -5!
        MathUtility.getFactorial(-5);
        //nhớ link kho 
    }
}
