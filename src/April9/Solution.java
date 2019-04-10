package April9;

class Solution {
    public int[] twoSum(int[] nums, int target) {
        for (int m=0; m<nums.length;m++){
            for (int n=0;n<nums.length;n++){
                if(n==m){
                    continue;
                }
                else{
                    if(nums[m]+nums[n]==target){
                        int[] result = {m,n};
                        return result;
                    }
                }
            }



        }
        return null;
    }
        public int reverse(int x) {
            int mod=0;
            long result=0;
            while (x != 0) {
                mod = x % 10;
                x /= 10;

                result = result * 10 + mod;
            }
            return (int)result;

    }

    public static void main(String[] args){
        Solution mySolution =new Solution();
        System.out.println(mySolution.reverse(123));
    }

}