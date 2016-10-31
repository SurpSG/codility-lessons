package com.sgnatiuk.codility.lesson3;

/**
 * Created by sgnatiuk on 10/31/16.
 */
public class PermMissingElem {

    public long solution(int[] A){
        long progressionN = A.length + 1;
        long sum = progressionN * (progressionN + 1) / 2;
        for (int i = 0; i < A.length; i++) {
            sum -= A[i];
        }
        return sum;
    }
}

