package fu.util.test;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.SQLException;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import phuc.util.MathUtility;

/**
 *
 * @author ADMIN
 */
public class MathUltilityTest {
    @Test
    // biến cái hàm ở trong class này thành public static void main nhờ bộ thư viện JUnit
    // Vì mặc định app chạy từ main chuẩn trong khi đó mình cần test thử hàm thôi không can thiệp main vì main dành cho app chạy vậy mình cần main khác và @Test giúp điều đó 
    //Nhưng vì có nhiều main nên CPU bị lỗi khi nhấn F6 như v F6 dành cho main mặc định còn shift F6 dành cho bên này
    
    //Cú pháp đặt tên hàm dùng để test hàm khác cuar dân QC 
    public void getFactorial_RunWell_IfValidArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }
    //hyperlink nhỏ nhỏ kệ nó luôn 
    
    //bắt ngoại lệ thế nào
    //ngoại lệ không phải là một value để mà so sánh do đó dùng hàm assertEquals là không được 
    //ta áp dụng kỹ thuật khác
    
    @Test(expected = IllegalArgumentException.class)
    public void getFactorial_ThrowsException_IfInvalidArgument() {
       
        MathUtility.getFactorial(-5);
    }
    //Tui muốn thấy màu xanh trên sever và thấy tick xanh luôn 
    
}
