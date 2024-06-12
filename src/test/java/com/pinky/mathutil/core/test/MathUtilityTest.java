/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.pinky.mathutil.core.test;

import com.pinky.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
//quy ước đặt tên package của Java
//tên miền đảo ngược, chữ thường 100%
//com.mycompany trên mạng
//com.tên-cty.tên-dự-án.tên-module.Tên-Class-Sẽ-Dùng
//com.microsoft.sqlserver.jdbc.
//org.junit.jupiter.api.Test
//com.viethuong.mathutil.core

//C# viết chiều xuôi, 
/**
 *
 * @author Admin
 */
public class MathUtilityTest {

    public MathUtilityTest() {
    }

    @BeforeAll
    public static void setUpClass() {
    }

    @AfterAll
    public static void tearDownClass() {
    }

    @BeforeEach
    public void setUp() {
    }

    @AfterEach
    public void tearDown() {
    }

    //ở đây chứa các lệnh các hàm dùng để đi test hàm chỉnh ở bên code 
    //ở tên thư mục source phía trên coi hàm chạy ổn ko
    // ở đây ta làm các hàm ứng với các test case để test code chính ở bên 
    //MathUtility. ví dụ .getFactorical()
    //TEST CASE: BỘ DATA ĐƯA VÀO HÀM, APP ĐỂ VERIFY HÀM, APP CÓ XỬ LÍ
    //ĐÚNG HAY KO, NÓ ĐI KÈM THEO CÁCH XÀI HÀM, TRÌNH TỰ XÀI APP: EXPECTED
    //VALUE : STATUS TEST CASE PASSED HAY FAILED
    //TEST CASE #1: CHECK GETFACTORIAL
    //TÊN HÀM mang ý nghĩa của test case luôn 
    @Test
    public void testFactorialGivenRightArg0ReturnWell() {
        int n = 0;
        long expectedValue = 1;
        long actualValue;
        // nếu expected == actual, hàm ngon với case này

        actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedValue, actualValue);
    }

    //TEST CASE #2; CHECK GETFACTORIAL WITH N = 1, EXPECTED => 1! = 1
    @Test
    public void testFactorialGivenRightArglReturnsWell() {
        int n = 1;
        long expectedValue = 1;
        long actualValue;
        actualValue = MathUtility.getFactorial(n);

        assertEquals(expectedValue, actualValue);
    }

    @Test
    public void testFactorialGivenRighArg235ReturnsWell() {
        int n = 2;
        long expectedValue = 2;
        long actualValue;
        actualValue = MathUtility.getFactorial(n);
        assertEquals(expectedValue, actualValue);
        
        assertEquals(6, MathUtility.getFactorial(3));

        assertEquals(120, MathUtility.getFactorial(5));
    }
     @Test
    public void testFactorialGivenWrongThrowException(){
        //ngoại lệ
        //MathUtiliyV1.getFactorial(-1);
        assertThrows(IllegalArgumentException.class, () -> {MathUtility.getFactorial(-1);});
    }
}
