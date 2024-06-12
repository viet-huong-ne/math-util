/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.pinky.mathutil.core.test;

import com.pinky.mathutil.core.MathUtility;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author Admin
 */
public class mathUtilityDDTTest {
    //CHUẨN BỊ BỘ DATA ĐƯA VÀO HÀM GETFAC()
    //0! -> 1 | 1! -> 1; | 2! -> 2 | 3! -> 6
    //{0,1}, {1,1}, {2,2}, {3,6}, {4,24}, {5,120}
    
    public static Object[][] initData(){
        return new Object[][]{
            {0,1}, 
            {1,1}, 
            {2,2}, 
            {3,6}, 
            {4,24}, 
            {5,120},
            {6,720}
        };
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactoryVenRightArgument1(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}
