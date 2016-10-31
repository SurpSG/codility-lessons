package com.sgnatiuk.codility.lesson3;

/**
 * Created by sgnatiuk on 10/31/16.
 */
public class TapeEquilibrium {

    int solution(int A[]){
        int value = Integer.MAX_VALUE;

        int sumRight = 0;
        for (int i = 1; i < A.length; i++) {
            sumRight += A[i];
        }

        int sumLeft = A[0];
        for (int j = 1; j < A.length; j++) {
            value = Math.min(value, Math.abs(sumLeft - sumRight));
            sumLeft += A[j];
            sumRight -= A[j];
        }
        return value;
    }

}
