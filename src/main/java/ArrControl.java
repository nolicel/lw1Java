/*
 * @(#)Blah.java 1.82 99/03/18
 *
 * Copyright (c) 1994-1999 Sun Microsystems, Inc.
 * 901 San Antonio Road, Palo Alto, California, 94303, U.S.A.
 * All Rights Reserved.
 *
 * This software is the confidential and proprietary information of Sun
 * Microsystems, Inc. ("Confidential Information"). You shall not
 * disclose such Confidential Information and shall use it only in
 * accordance with the terms of the license agreement you entered into
 * with Sun.
 */

import java.util.Arrays;
/**
 *
 * this class are solution of third exercise lw1
 * his contain one method for finding such opportunities to separate the array so that two parts are equals
 *
 * @author Scherbina Igor
 * @version 1.82 2 Oct 2022
 */
public class ArrControl {
    public static void main(String[] args) {
        int[] arrayControl = {2,3,1,2,2};// array initialization
        System.out.println(Arrays.toString(arrayControl));// print a string representation of an array
        System.out.println(isArrEquals(arrayControl));//print result
    }
    private static boolean isArrEquals(int[] array){
        /**
         *method that takes on the input an array of integers and returns true
         */
        if (array.length>2){
            // if array lenght <2 return false
            for (int i = 0; i < array.length -1 ; i++) {
                    int first = 0;
                    int second = 0;
                    //two variables for the comparison of the array
                for (int j = 0; j <= i ; j++) {
                    first+=array[j];
                    //sum up firs part of array
                }
                for (int k = i+1; k < array.length ; k++) {
                    second+=array[k];
                    //sum up second part of array
                }

                if(first == second){
                    return true;
                    //return true if two part of array is equals
                }
            }
        }
        return false;
    }
}
