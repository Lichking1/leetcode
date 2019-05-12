package May12;

public class Solution {
    public String addBinary(String a, String b) {
        long valueA=0;
        long valueB=0;

        for (int i=0;i<a.length();i++){

            if(a.charAt(i) == '1') {

                valueA += Math.pow(2,a.length()-i-1);
                System.out.println(valueA);
            }

        }

        for (int i=0;i<b.length();i++){

            if(b.charAt(i)=='1') {
                valueB += Math.pow(2,b.length()-i-1);
            }

        }

        System.out.println(valueA);
        System.out.println(valueB);
        long result= valueB + valueA;
        String binaryResult=Long.toBinaryString(result);

        return  binaryResult;

    }

    public int pivotIndex(int[] nums) {
        if (nums.length < 2) return -1;
        int leftSum = 0;
        int rightSum = 0;
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }

        for (int i = 0; i < nums.length; i++) {
            if (i == 0) {
                leftSum = 0;
            } else {
                leftSum += nums[i-1];
                System.out.println(leftSum);
            }

            rightSum = sum - leftSum - nums[i];

            if (leftSum == rightSum) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        String a="11010";
        String b="00010";
        int[] nums = {1, 7, 3, 6, 5, 6};
        Solution mySolution =new Solution();
        System.out.println(mySolution.pivotIndex(nums));
    }
}
