package April9;

import java.util.List;

//Easy: T1 and T7 and T9
class Solution {

    //O(n^2) 可以通过 list, hashmap 来提高运行速度
    public int[] twoSum(int[] nums, int target) {
        for (int m=0; m<nums.length;m++){
            for (int n=0;n<nums.length;n++){
                if(n==m){
                    continue;
                }
                else{
                    if(nums[m]+nums[n]==target){

                        return new int[] {m,n};
                    }
                }
            }



        }
        return null;
    }

    //T7: Better solution of reverse an integer
    // Good thought of the overflow,
    // making data type long and compare with the Integer.MAX_VALUE
    public int reverse(int x) {
        int mod;
        long result=0;
        while(x!=0){
            mod=x%10;
            x/=10;
            result=10*result+mod;

            if(result<Integer.MIN_VALUE||result>Integer.MAX_VALUE)
                return 0;
        }
        return (int)result;

    }

    //T9: Using the thoughts of T7, reverse the integer
    //Other solution Change to String
    //return String.valueOf(x).equals
    // (new StringBuilder(String.valueOf(x)).reverse().toString());
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        else{
            return (reverse(x)==x);

        }
    }

    public static void main(String[] args){
        Solution mySolution =new Solution();
        System.out.println(mySolution.isPalindrome(123454321));
    }

}