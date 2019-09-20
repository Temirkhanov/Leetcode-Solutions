package Strings;

public class CountSay {
    public String countnndSay(int n) {
        String curr = "1";

        for (int i = 1; i < n; ++i) {
            String temp = "";
            int count = 0;
            char prevChar = curr.charAt(0);
            for (int cursor = 0; cursor < curr.length(); ++cursor) {
                char currChar = curr.charAt(cursor);
                if (currChar != prevChar) {
                    temp += count + String.valueOf(prevChar);
                    prevChar = currChar;
                    count = 0;
                }
                ++count;
            }
            temp += count + String.valueOf(prevChar);
            curr = temp;
        }

        return curr;
    }

}
