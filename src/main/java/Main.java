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
 * this class are solution of first exercise lw1
 * his contain one method, which takes on the input an array of integers and returns true if in the array each
 *
 * @author Scherbina Igor
 * @version 1.82 2 Oct 2022
 */
public class Main {
    public static void main(String[] args) {
        int[] arrayTooControl = new int[]{2, 1, 3, 4, 5};
        System.out.println(isSorted(arrayTooControl));
    }

    private static boolean isSorted(int[] array) {

        if (array.length >= 2) {

            boolean flag = false;//set the default value to false

            for (int i = 0; i < array.length - 1; i++) {
                if (array[i + 1] >= array[i]) {
                    flag = true; //set the value if each element in the array is greater than or equal to the previous
                } else {
                    flag = false;
                    break;
                }
            }
            return flag;//return the result of the operation.
        }
        return false;//returns false if the array does not meet the condition
    }
}
