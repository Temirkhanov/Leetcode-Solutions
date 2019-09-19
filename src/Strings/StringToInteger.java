package Strings;

public class StringToInteger {

    public static int myAtoi(String str) {
        str = str.trim();
        if(str.length() < 1 || str == null )
            return 0;
        double result = 0;
        char sign = '+';
        int i = 0;
        if(str.charAt(0) == '-'){
            sign = '-';
            i++;
        }
        else if(str.charAt(0) == '+')
            i++;
        while(str.length() > i && str.charAt(i) >= '0' && str.charAt(i) <= '9'){
            result = result * 10 + (str.charAt(i) - '0');
            i++;
        }
        if(sign == '-')
            result = -result;
        if(result > Integer.MAX_VALUE)
            return Integer.MAX_VALUE;
        if(result < Integer.MIN_VALUE)
            return Integer.MIN_VALUE;
        return (int)result;
    }


    public static void main(String[] args){
        System.out.println(myAtoi("   -42"));
    }
}
