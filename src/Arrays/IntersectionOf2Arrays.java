package Arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IntersectionOf2Arrays {

    public int[] intersect(int[] nums1, int[] nums2) {
        ArrayList<Integer> list = new ArrayList<>();
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp[];
        if (nums1.length < nums2.length) {
            temp = nums1;
            nums1 = nums2;
            nums2 = temp;
        }
        for (int num : nums1) {
            if (map.containsKey(num))
                map.put(num, map.get(num) + 1);
            else map.put(num, 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                list.add(num);
                if (map.get(num) == 1)
                    map.remove(num);
                else map.put(num, map.get(num) - 1);
            }
        }
        int[] result = new int[list.size()];
        for (int i = 0; i < result.length; i++) {
            result[i] = list.get(i);
        }
        return result;
    }


}
