
/**
 * Created by sgnatiuk on 10/26/16.
 */
public class NegativeNumberBase {

    public int[] solution(int[] A){
        return ToNegabinary(
                -1 * convertToDec(A)
        );
    }


    private static int convertToDec(int[] digits){
        int sum = 0;
        for (int i = 0; i < digits.length; i++) {
            sum += digits[i]*Math.pow(-2,i);
        }
        return sum;
    }

    static int[] ToNegabinary(int value)
    {
        String result = "";

        while (value != 0)
        {
            int remainder = value % -2;
            value = value / -2;

            if (remainder < 0)
            {
                remainder *= -1;
                value += 1;
            }

            result = remainder + result;
        }

        int[] digits = new int[result.length()];
        char[] chars = result.toCharArray();
        for (int i = 0; i < chars.length ; i++) {
            digits[digits.length - 1 - i] = Integer.parseInt(chars[i]+"");
        }
        return digits;
    }
}
