package com.sgnatiuk.codility.Lesson2;

import java.util.Arrays;

/**
 * Created by sgnatiuk on 10/28/16.
 * A zero-indexed array A consisting of N integers is given.
 * Rotation of the array means that each element is shifted right by one index,
 * and the last element of the array is also moved to the first place.
 */
public class CyclicRotation {
    public int[] solution(int[] A, int K){
        if(A.length == 0 || K % A.length == 0){
            return A;
        }
        int index = A.length - K % A.length;
        int[] a = Arrays.copyOfRange(A, 0, index);
        int[] b = Arrays.copyOfRange(A, index, A.length);
        return concat(b, a);
    }

    public int[] concat(int[] a, int[] b) {
        int aLen = a.length;
        int bLen = b.length;
        int[] c= new int[aLen+bLen];
        System.arraycopy(a, 0, c, 0, aLen);
        System.arraycopy(b, 0, c, aLen, bLen);
        return c;
    }
}
