package Strings;

public class FindIndex {
    public static int strStr(String haystack, String needle) {
        if(needle == null || needle.length() < 1 || haystack.equals(needle))
            return 0;
        if(haystack.length() < needle.length())
            return -1;
        for(int i = 0; i <= haystack.length()-needle.length(); i++){
            if(haystack.substring(i, i+needle.length()).equals(needle))
                return i;
        }
        return -1;
    }


    public static void main(String[] args){
        System.out.println(strStr("mississippi", "pi"));
    }
}
