package Strings;

public class ValidPalindrome {

    public boolean isPalindrome(String s) {
        if(s.length() < 2)
            return true;
        s = s.toLowerCase().trim();
        int i = 0, j = s.length()-1;
        while(i < j){
            while(i < j && !Character.isDigit(s.charAt(i)) && !Character.isAlphabetic(s.charAt(i)))
                i++;
            while(i < j && !Character.isDigit(s.charAt(j)) && !Character.isAlphabetic(s.charAt(j)))
                j--;
            if(s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

}
