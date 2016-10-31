package com.sgnatiuk.codility.lesson3;

/**
 * Created by sgnatiuk on 10/31/16.
 */
public class FrogJmp {
    public int solution(int X, int Y, int D) {
        int distance = Y - X;
        return distance == 0 ? 0 : divRoundUp(distance, D);
    }

    static int divRoundUp(int a, int b){
        return (a - 1) / b + 1;
    }
}
