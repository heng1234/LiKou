package com.hlvy.likou.lkou;

/**
 * @author : 恒果果
 * create at:  2019-12-04  18:32
 * @description: LCP 1. 猜数字
 */
public class LK_LCP1 {

    /**
     * 小A 和 小B 在玩猜数字。小B 每次从 1, 2, 3 中随机选择一个，小A 每次也从 1, 2, 3 中选择一个猜。他们一共进行三次这个游戏，请返回 小A 猜对了几次？
     * <p>
     *  
     * <p>
     * 输入的guess数组为 小A 每次的猜测，answer数组为 小B 每次的选择。guess和answer的长度都等于3。
     * <p>
     *  
     * <p>
     * 示例 1：
     * <p>
     * 输入：guess = [1,2,3], answer = [1,2,3]
     * 输出：3
     * 解释：小A 每次都猜对了。
     *  
     * <p>
     * 示例 2：
     * <p>
     * 输入：guess = [2,2,3], answer = [3,2,1]
     * 输出：1
     * 解释：小A 只猜对了第二次。
     *  
     * <p>
     * 限制：
     * <p>
     * guess的长度 = 3
     * answer的长度 = 3
     * guess的元素取值为 {1, 2, 3} 之一。
     * answer的元素取值为 {1, 2, 3} 之一。
     */
   /*
    执行用时 :0 ms, 在所有 java 提交中击败了100.00%的用户
    内存消耗 :33.9 MB, 在所有 java 提交中击败了100.00%的用户
    */
    public int game(int[] guess, int[] answer) {
        int count = 0;
        for (int i = 0; i < guess.length; i++) {
            if (guess[i] == answer[i]) {
                count++;
            }
        }
        return count;
    }
}
