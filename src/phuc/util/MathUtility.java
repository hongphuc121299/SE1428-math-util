
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phuc.util;

/**
 *
 * @author giao-lang
 */
//ta sẽ làm class fake class Math với các hàm static để xài chung cho mọi nơi
    public class MathUtility {
    
    //ta sẽ làm class fake class Math với các hàm static để xài chung cho mọi nơi
    public static final double PI = 3.14;
    
    //hàm tính n! = 1.2.3...n
    //trong đó ko giai thừa âm, > 20 tràn kiểu long
    //quy ước 0! = 1! = 1;
    //đưa vào n âm, hoặc n > 20, ta ko thèm tính gì cả, chửi Exception
    public static long getFactorial(int n) {
        if (n < 0 || n > 20)
            throw new IllegalArgumentException("n must be between 0..20");
        
        if (n == 0 || n == 1)
            return 1; //1 lệnh trong if ko xài ngoặc
        
        //chỗ này thằng nào xài else trừ điểm
        //ngay chỗ này chính là n = 2..20
        long result = 1;
        
        for (int i = 2; i <= n; i++) 
            result *= i;
        
        return result;
    }
}

//ta tự tin gáy hàm ta chạy ngon, chạy đúng
//nhưng: team thì cần chứng minh điều đó, đảm bảo chất lượng code, chất lượng hàm
//muốn chứng minh hàm chạy đúng hay ko ta cần test thử
//test nghĩa là đưa hàm ra xài, gọi với các tham số khác nhau
//ví dụ gọi hàm getFactorial(với các số khác nhau đưa vào)
//getF(-5), getF(-1) getF(0), getF(5), getF(20), getF(21), ...
//các giá trị đầu vào đại diện cho việc xài hàm,
//ta còn gọi là test cases, các tình huống cần test, các tình huống xài hàm
//khi ta test hàm, ta cần quan tâm 2 việc
//1. dự kiến hàm trả về giá trị gì khi hàm chạy với 1 đầu vào nào đó
//   dự kiến hàm trả về giá trị, tui gọi là EXPECTED VALUE
//   ví dụ: hàm sẽ trả về 120 khi gọi getF(5!)
//2. hàm khi chạy với 1 đầu vào nào đó, thì nó sẽ ói/return về 1 value
//   cái value trả về của hàm khi chạy đc gọi là ACTUAL VALUE

//NGHỀ TEST CHÍNH LÀ: SO SÁNH COI EXPECTED VALUE CÓ BẰNG VỚI ACTUAL VALUE HEM?
//NẾU CÓ BẰNG, HÀM ĐÚNG CHO CASE/TÌNH HUỐNG NÀY
//NẾU KO BẰNG, HÀM TÍNH TOÁN SAI, HOẶC KÌ VỌNG SAI

//HÀM MÀ TỐT THÌ PHẢI LÀ EXPECTED == ACTUAL MỌI TÌNH HUỐNG
//NẾU TỐT TA MỚI ĐEM RA XÀI, BÁN, PUBLIC CỘNG ĐỒNG XÀI

//LÀM SAO ĐỂ TEST HÀM COI CÓ TỐT KO, EXPECTED == ACTUAL
//HAI KĨ THUẬT ĐC ÁP DỤNG
//KĨ THUẬT 1: Nhìn bằng mắt và so sánh từng cặp expected vs. actual
//          chính là kĩ thuật sout(expected), sout(actual-hàm ói về gì khi chạy)
//kĩ thuật này đơn giản, dễ làm, nhưng mắc sai sót do có quá nhiều cặp
//expected actual cần so sánh bằng mắt

//KĨ THUẬT 2: Nhìn bằng mắt, ko cần so sánh từng cặp, để máy so sánh giùm luôn
//           mắt chỉ nhìn 2 màu XANH-ĐỎ DUY NHẤT
//nếu tất cả các cặp actual vs. expected đều thỏa, MÀU XANH CHO TẤT CẢ
//nếu HẦU HẾT các cặp actual vs. expected đều thỏa, có 1 vài cái ko thỏa
//THÌ KẾT LUẬN NGÀY, HÀM SAI, MÀU ĐỎ CHO TẤT CẢ
//điều này giải thích là: đúng thì phải đúng cho tất cả mọi tình huống hàm chạy
//chỉ cần 1 thằng sai, hàm sai

//tương đương câu: hàm tui chạy ngon lắm, đúng 99.9%, lâu lâu sai tí
//nói câu đó: hàm éo tin cậy để xài
//KĨ THUẬT 2 NÀY DÙNG MÀU SẮC, MÚN LÀM VẬY THÌ PHẢI XÀI THƯ VIỆN BỔ SUNG THÊM
//CHÍNH LÀ FILE .JAR, .DLL ĐC CUNG CẤP THÊM NGOÀI JDK
//Các thư viện này tùy thuộc ngôn ngữ lập trình, đc gọi chung là 
//Unit Test framework, 
//C#: thư viện cụ thể NUnit, MSUnit, xUnit
//Java: thư viện cụ thể JUnit, TestNG, xUnit
//PHP:  PHPUnit
//C++: CPPUnit
//...
