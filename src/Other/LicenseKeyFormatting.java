package Other;

public class LicenseKeyFormatting {

    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder result = new StringBuilder("");
        String s = S.replaceAll("-", "").toUpperCase();
        int len = s.length();
        if(len == 0 || len == K)
            return s;
        int ind = 1;
        for(int i = 1; i <= K; i++){
            if(((len - i) % K) == 0){
                ind = i;
            }
        }
        result.append(s.substring(0, ind));
        while(ind <= len-K){
            result.append('-');
            result.append(s.substring(ind, ind+K));
            ind += K;
        }
        return result.toString();
    }


    public static void main(String[] args){
        licenseKeyFormatting("5F3Z-2e-9-w", 4);
    }

}
