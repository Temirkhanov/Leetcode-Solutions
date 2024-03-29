package Strings;

public class ReverseInteger {
    public int reverse(int x) {
        long y = 0;
        while(x != 0){
            y = y * 10 + (x % 10);
            x /= 10;
        }
        if(y > Integer.MAX_VALUE || y < Integer.MIN_VALUE)
            return 0;
        return (int)y;
    }
}
