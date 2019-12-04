package com.hlvy.likou.lkou;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : 恒果果
 * create at:  2019-12-02  17:46
 * @description: 1. 两数之和
 */
public class LK_1 {
    /**
     * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
     *
     * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
     *
     * 示例:
     *
     * 给定 nums = [2, 7, 11, 15], target = 9
     *
     * 因为 nums[0] + nums[1] = 2 + 7 = 9
     * 所以返回 [0, 1]
     *
     */
/*
    [3,2,4]
            6
    输出
[0,0]
    预期结果
[1,2]*/
    public int[] twoSum(int[] nums, int target) {
        int[] tl = new int[2];
        Map<Integer,Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            Integer num = nums[i];
            Integer tnum = map.get(target-num);
            if(map.containsKey(target-num) && i  != tnum){
                tl[0] = i;
                tl[1] = tnum;
                return tl;
            }
        }
        return null;
    }

    public static void main(String[] args) {
        LK_1 lk_1 = new LK_1();
        int [] it = {3, 2, 4};
        for (int i : lk_1.twoSum(it, 6)) {
            System.err.println(i);
        }
    }
}
