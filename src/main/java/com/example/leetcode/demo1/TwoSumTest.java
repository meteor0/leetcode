package com.example.leetcode.demo1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumTest {

  /**
   * 解法二 放入map中
   * @param nums
   * @param target
   * @return
   */
  public static int[] twoSum2(int[] nums, int target) {
    int[] result = new int[2];
    Map<Integer, Integer> params = new HashMap<>(nums.length);
    for (int i = 0; i < nums.length; i++) {
      int value = nums[i];
      params.put(value, i);
      int value1 = nums[i + 1];
      int margin = target - value1;
      if (params.containsKey(margin)) {
        int index2 = params.get(margin);
        //margin已经在map保存,所以索引靠前
        result[0] = index2;
        result[1] = i + 1;
        break;
      }
    }
    return result;
  }

  /**
   * 解法一 双重for循环
   * @param nums
   * @param target
   * @return
   */
  public static int[] twoSum1(int[] nums, int target) {
    int[] result = new int[2];
    for (int i = 0; i < nums.length; i++) {
      for (int j = i + 1; j < nums.length; j++) {
        if (nums[i] + nums[j] == target) {
          result[0] = i;
          result[1] = j;
          return result;
        }
      }
    }
    return result;
  }

  public static void main(String[] args) {
    int[] param = {3, 1, 0, 2, 4};
    int[] twoSum = twoSum1(param, 6);
    System.out.println(Arrays.toString(twoSum));
  }

}
