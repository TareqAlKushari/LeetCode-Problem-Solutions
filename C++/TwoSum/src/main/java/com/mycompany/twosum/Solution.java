/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.twosum;

import java.util.HashMap;
import java.util.Map;

/*
    for(int i = 0; i < nums.length; i++){
            for(int j =i+1; j < nums.length; j++){
                int complement = target - nums[i];
                if(nums[j] == complement){
                    return new int[]{i, j};
                }
            }
        }
        throw new IllegalArgumentException("no match found");
 */
public class Solution {
    
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> num_map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int complement = target - nums[i];
            if(num_map.containsKey(complement)) {
                return new int[] {num_map.get(complement), i};
            }
            num_map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no match found!");
    }
}
