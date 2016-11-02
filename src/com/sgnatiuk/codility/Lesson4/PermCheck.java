package com.sgnatiuk.codility.Lesson4;

/**
 * Created by Surop on 11/1/2016.
 */
public class PermCheck {
    public int solution(int[] A) {
        int res = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > A.length || A[i] < 1) return 0;
            res ^= (i+1) ^ A[i];
        }
        return res == 0 ? 1 : 0;
    }
}
