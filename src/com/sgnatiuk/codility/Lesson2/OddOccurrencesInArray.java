package com.sgnatiuk.codility.Lesson2;

/**
 * Created by Surop on 10/30/2016.
 */
public class OddOccurrencesInArray {
    public int solution(int[] A) {
        int res = 0;
        for(int element: A){
            res ^= element;
        }
        return res;
    }
}