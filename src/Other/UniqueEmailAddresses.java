package Other;

import java.util.HashSet;
import java.util.Set;

public class UniqueEmailAddresses {

    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        StringBuilder str = new StringBuilder("");
        for (String email: emails){
            int i = 0;
            while(i != email.indexOf('@')){
                char c = email.charAt(i);
                if (c == '+') break;
                if (c != '.') str.append(c);
                i++;
            }
            str.append(email.substring(email.indexOf('@')));
            if (!set.contains(str.toString()))
                set.add(str.toString());
            str.setLength(0);
        }
        return set.size();
    }

}
