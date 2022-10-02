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
 * this class are solution of second exercise lw1
 * his contain one method for implementing the British game FizzBuzz
 *
 * @author Scherbina Igor
 * @version 1.82 2 Oct 2022
 */
public class FizzBuzz {
    public static void main(String[] args) {
        //And when the number is divisible by both 3 and 5, print "FizzBuzz."
        for (int i = 1;i <=100; i++){
            if (i % 3 == 0 && i % 5 == 0 ){
                System.out.println("FizzBuzz");
            }//print FizzBuzz if the number is multiple to 3 and 5
            else if (i % 3 == 0){
                System.out.println("Fizz");
            }//print Fizz if the number is multiple to 3
            else if (i % 5 == 0){
                System.out.println("Buzz");
            }//print Buzz if the number is multiple to 5
            else{
                System.out.println(i);
            }//in other cases displayed number

        }
    }
}
