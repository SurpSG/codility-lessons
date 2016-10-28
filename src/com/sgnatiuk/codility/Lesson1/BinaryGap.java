package com.sgnatiuk.codility.Lesson1;


/**
 * Created by sgnatiuk on 10/28/16.
 * <p/>
 * Task
 * <p/>
 * A binary gap within a positive integer N is any maximal sequence of consecutive zeros that is surrounded by ones at
 * both ends in the binary representation of N.
 * For example, number 9 has binary representation 1001 and contains a binary gap of length 2.
 * The number 529 has binary representation 1000010001 and contains two binary gaps:one of length 4 and one of length 3.
 * The number 20 has binary representation 10100 and contains one binary gap of length 1.
 * The number 15 has binary representation 1111 and has no binary gaps.
 */
public class BinaryGap {

    public int solution(int N) {
        int maxGepLength = 0;
        int currentGepLength = 0;
        int rightBorder = 2;
        do {
            int div = N % 2;
            N /= 2;
            if (div == 0) {
                currentGepLength = rightBorder == 1 ? ++currentGepLength : 0;
            } else {
                maxGepLength = Math.max(maxGepLength, currentGepLength);
                currentGepLength = 0;
                rightBorder = 1;
            }
        } while (N != 0);
        return maxGepLength;
    }
}
