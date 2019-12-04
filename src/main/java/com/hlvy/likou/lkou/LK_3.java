package com.hlvy.likou.lkou;

import java.util.*;

/**
 * @author : 恒果果
 * create at:  2019-12-02  18:20
 * @description: 3. 无重复字符的最长子串
 */
public class LK_3 {
    /**
     * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
     *
     * 示例 1:
     *
     * 输入: "abcabcbb"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "abc"，所以其长度为 3。
     * 示例 2:
     *
     * 输入: "bbbbb"
     * 输出: 1
     * 解释: 因为无重复字符的最长子串是 "b"，所以其长度为 1。
     * 示例 3:
     *
     * 输入: "pwwkew"
     * 输出: 3
     * 解释: 因为无重复字符的最长子串是 "wke"，所以其长度为 3。
     *      请注意，你的答案必须是 子串 的长度，"pwke" 是一个子序列，不是子串。
     *
     */
    public int lengthOfLongestSubstring(String s) {
        Set<Integer> res = new TreeSet<>();
        List<Character> list = new ArrayList<>();
       char [] cs = s.toCharArray();
       int start = 0;
       int count = 0;
        for (int i = 0; i < cs.length; i++) {
            if (!list.contains(cs[i])){
                list.add(cs[i]);
                count+=1;
            }else {
                start+= 1;
                i = start;
                res.add(count);
                count=0;
                list = new ArrayList<>();
                list.add(cs[i]);
                count+=1;
            }
            if (i == cs.length-1){
                res.add(count);
            }

        }
        return maxNum(res);
    }

    private int maxNum(Set<Integer> set){
       Iterator<Integer> iterator = set.iterator();
       Integer res = 0;
        while (iterator.hasNext()) {
            Integer next = iterator.next();
            if (next > res){
                res = next;
            }
        }
        return  res;
    }
    public static void main(String[] args) {
        LK_3 lk_3 = new LK_3();
        System.out.println(lk_3.lengthOfLongestSubstring("dvdf"));
    }
}
