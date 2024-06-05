/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pinky.mathutil.core;

/**
 *
 * @author Admin
 */
public class MathUtility {

    //ta viết những hàm toán học cung cấp cho bên ngoài sử dụng
    // giống như thư viện Math. của JDK
    // các hàm mang ý nghĩa tiện ích dùng chung cho nhiều nơi thì sẽ được thiết kế là static
    //static sẽ đc gọi trực tiếp qua tên class
    // Hàm tính n! = 1.2.3.4...n
    //n 0...20; do 21! tràn kiểu long, ko có âm giai thừa
    public static long getFactorial(int n) {

        long product = 1; //biến con heo đất, biến nhân dồn
        //sửa lại từ 10 thành 1 để có màu xanh trở lại
        if (n < 0 || n > 20) {
            throw new IllegalArgumentException("Invalid n. n must be between 0 to 20");
        }
        
        if (n == 0) 
            return 1;
        // code chạy đến đây, n = 1...2...20
        for (int i = 1; i <= n; i++) {
            product *= i; 
        }
        return product;
    }
}
