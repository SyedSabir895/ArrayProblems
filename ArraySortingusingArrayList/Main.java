// package ArraySortingusingArrayList

import java.util.ArrayList;

public class Main {
    public static boolean Sorting(ArrayList<Integer> nums) {
        int count = 1;
        for (int i = 1; i < nums.size(); i++) {
            if (nums.get(i - 1) <= nums.get(i)) {
                count++;
                continue;
            } else {
                return false;
            }
        }
        if (count == nums.size()) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(5);
        nums.add(6);
        nums.add(8);
        nums.add(7);
        boolean res = Sorting(nums);
        System.out.println(res);
    }
}