package com.sgnatiuk.codility.Lesson4;

/**
 * Created by Surop on 11/1/2016.
 */
public class PermCheck {
    public int solution(int[] A) {
        int xor = 0;
        int xorI = 0;
        int sum = 0;
        for (int i = 0; i < A.length; i++) {
            if(A[i] > A.length || A[i] < 1){
                return 0;
            }
            sum += A[i];
            xor ^= A[i];
            xorI ^= i+1;
        }
        int n = A.length;
        int expectedSum = n*(n+1)/2;
        return sum == expectedSum && xor == xorI ? 1 : 0;
    }
}
