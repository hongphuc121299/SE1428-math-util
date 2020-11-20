/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import phuc.util.MathUtility;

/**
 *
 * @author ADMIN
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long expected = 120;         //tao hy vọng 120 đc ói về nếu
        long actual = MathUtility.getFactorial(5);  //tao gọi hàm 5!
        System.out.println("5!? expected: " + expected + "; actual: " + actual);
        //đúng cho case tình huống đầu tiên
        
        expected = 720;  //hy vọng ói về 720 nếu tao gọi 
        actual = MathUtility.getFactorial(6);  //6!
        System.out.println("6!? expected: " + expected + "; actual: " + actual);
        //đúng case 2
        
        //case 3:
        System.out.println("0!? expected: 1; actual: " + MathUtility.getFactorial(0));
    
        //case 4: 
        //tao kì vọng nhận về ngoại lệ IllegalArgumentException
        //nếu tao gọi -5!
        MathUtility.getFactorial(-5);
        //thấy ngoại lệ lại mừng vì hàm chạy như thiết kế
        
        
    }
}

//cất code lên server GitHub
//cần:
//nhớ kho trên GitHub, url: https://github.com/tên-mình/tên-kho.git
//nhớ username và pass và email vào GitHub của mình
//cần tool để đồng bộ code từ máy mình (local) lên server (GitHub, GitLab, BitBucket)
//tool có thể là: cmd, GUI (Git Desktop, Source Tree), chính IDE (cmd, click) 
//vì ta pro, ta chơi cmd
//cài git scm đã nói download sẵn


