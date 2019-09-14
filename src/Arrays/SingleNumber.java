package Arrays;

import java.util.HashSet;
import java.util.Set;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int num : nums)
            if (set.contains(num))
                set.remove(num);
            else set.add(num);
        int result = set.iterator().next();
        return result;
    }

    // XOR solution
    public static int singleNum(int[] nums){
        int res = nums[0];
        for (int i = 1; i < nums.length; i++){
            System.out.print(res + " XOR " + nums[i] + " = ");
            res = res ^ nums[i];
            System.out.print(res + "\n");
        }
        return res;
    }

    public static void printArr(int[] a){
        for(int b : a)
            System.out.print(b + ", ");
        System.out.println("\n--------------");
    }


    public static void main(String[] args){
        int[] a = {2, 3, 5, 4, 5, 3, 4};
        printArr(a);
        System.out.println("Single int -> " + singleNum(a));
    }


}
