package com.hlvy.likou.lkou;

/**
 * @author : 恒果果
 * create at:  2019-12-05  11:33
 * @description: IP 地址无效化
 */
public class LK_1108 {
   /**
     * 给你一个有效的 IPv4 地址 address，返回这个 IP 地址的无效化版本。
     *
     * 所谓无效化 IP 地址，其实就是用 "[.]" 代替了每个 "."。
     *
     *  
     *
     * 示例 1：
     *
     * 输入：address = "1.1.1.1"
     * 输出："1[.]1[.]1[.]1"
     * 示例 2：
     *
     * 输入：address = "255.100.50.0"
     * 输出："255[.]100[.]50[.]0"
     *  
     *
     * 提示：
     *
     * 给出的 address 是一个有效的 IPv4 地址
     *
     */
   public String defangIPaddr(String address) {
     return address.replaceAll("\\.","[.]");
   }

    public static void main(String[] args) {
        LK_1108 lk_1108 = new LK_1108();
        System.out.println(lk_1108.defangIPaddr("1.1.1.1"));
    }
}
