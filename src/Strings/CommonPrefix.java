package Strings;

public class CommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        if(strs.length == 1)
            return strs[0];
        if(strs.length == 0)
            return "";
        int minLen = strs[0].length();
        for(int i = 1; i < strs.length; i++)
            if(strs[i].length() < minLen)
                minLen = strs[i].length();
        String result = strs[0].substring(0, minLen);
        int i = 1;
        while(i < strs.length){
            if(result.equals(""))
                return "";
            if(!result.equals(strs[i].substring(0, result.length()))) {
                System.out.println("Current: " + result + " -> " + result.substring(0, result.length() - 1));
                result = result.substring(0, result.length() - 1);

                i = 1;
            }
            else i++;
        }
        return result;
    }

    public static void main(String[] args){
        String[] arr =
                {
                        "aca","cba"
                        //"flower","flow","flight"
                };
        System.out.println(longestCommonPrefix(arr));
    }
}
