/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pinky.mathutil.main;

import com.pinky.mathutil.core.MathUtility;
import javax.swing.JOptionPane;

/**
 *
 * @author Admin
 */
public class Main {
    //this method is written in local
    public static void sayHiFromLocal(){
    
    }
    public static void main(String[] args) {
        //CÁCH KIỂM THỬ 2 - GIỐNG CÁCH 1
        //Test case #1: check if 0! returns 1
        int n = 0;
        long expectedResult = 1; //0! == 1
        long actualResult = MathUtility.getFactorial(n);
        String msg = "0!= | Expected: " + expectedResult + " Actual: " + actualResult;
        JOptionPane.showMessageDialog(null, msg);
    }

//
//    public static void main(String[] args) {
//        // ĐÂY LÀ NƠI TEST HÀM
//        // VIẾT RA CÁC TEST CASE: BỘ DATA ĐẦU VÀO VÀ GIÁ TRỊ KÌ VỌNG
//        // LÁT HỒI SO SÁNH VỚI GIÁ TRỊ THỰC TẾ MÀ HÀM TRẢ VỀ!!!
//        // Test case #1: n = 0 | 0! = hy vọng == 1 | thực tế chờ hàm trả về
//        int n = 0;
//        long expectedValue = 1;
//        long actualValue;
//        actualValue = MathUtility.getFactorial(n);
//        //so sánh giữa expect vs actual coi có == nhau hay ko
//        System.out.println("0! | Expected:" + expectedValue + " Actual: " + actualValue);
//        
//        //TEST CASE #2: 1! TA HY VỌNG HÀM TRẢ 1 LUÔN!!
//        n = 1;
//        expectedValue = 1;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("1! | Expected:" + expectedValue + " Actual: " + actualValue);
//        
//        //TEST CASE #3: 5! TA HY VỌNG HÀM TRẢ 120 LUÔN!!
//        n = 5;
//        expectedValue = 120;
//        actualValue = MathUtility.getFactorial(n);
//        System.out.println("5! | Expected:" + expectedValue + " Actual: " + actualValue);
//        
//        //TEST CASE #4: -1! TA HY VỌNG HÀM NÉM RA NGOẠI LỆ!!
//        //DO -1 KO TÍNH ĐC GIAI THỪA, ĐƯA DATA CÀ CHỚN, HÀM SẼ NÉM RA NGOẠI LỆ
//        n = -1;
//        //expectedValue = HÀM TUNG RA NGOẠI LỆ;
//        System.out.println("Check getF(-1) to see the exception!");
//        actualValue = MathUtility.getFactorial(n);
//        //HY VỌNG SẼ THẤY NGOẠI LỆ XUẤT HIỆN
//
//    }
//

}
