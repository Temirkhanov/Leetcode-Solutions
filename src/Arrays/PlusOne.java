package Arrays;

public class PlusOne {

    public int[] plusOne(int[] digits) {
        int len = digits.length;
        digits[len-1]++;
        if(digits[len-1] < 10)
            return digits;
        for(int i = len-1; i >= 0; i--){
            if(digits[i] >= 9)
                digits[i] = 0;
            else {
                digits[i]++;
                break;
            }
        }

        int[] result;
        if(digits[0] == 0) {
            result = new int[len + 1];
            result[0] = 1;
            for(int i = 1; i <= len; i++)
                result[i] = digits[i-1];
            return result;
        }
        return digits;
    }


}
