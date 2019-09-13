package Arrays;

public class RotateArray {

    // Given an array, rotate the array to the right by k steps, where k is non-negative.

    public static void rotate(int[] nums, int k) {
        if(k > nums.length)
            k = k % nums.length;
        int temp, i = nums.length - k;
        reverse(nums, 0, i-1);
        reverse(nums, i, nums.length-1);
        reverse(nums, 0, nums.length-1);

    }


    public static void reverse(int[] a, int start, int end) {
        if(a == null || a.length == 1)
            return;
        int temp;
        while(start < end){
            temp = a[end];
            a[end] = a[start];
            a[start] = temp;
            start++;
            end--;
        }
    }


    public static void print(int a, int b){
        System.out.println("Swapping: " + a + " and " + b);
    }

    public static void printArr(int[] a){
        for(int b : a)
            System.out.print(b + ", ");
        System.out.println("\n--------------");
    }

    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7};
        System.out.println("1,2,3,4,5,6,7");
        rotate(nums, 3);
    }

}
