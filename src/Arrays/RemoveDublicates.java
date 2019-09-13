package Arrays;

public class RemoveDublicates {

    // Given a sorted array nums, remove the duplicates in-place such that each element appear only once and return the new length.

    public int removeDuplicates(int[] nums) {
        int j = 0;
        for(int i = 1; i < nums.length; i++)
            if(nums[j] != nums[i]){
                j++;
                nums[j] = nums[i];
        }
        return j + 1;
    }

}
