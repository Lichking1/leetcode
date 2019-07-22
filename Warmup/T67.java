//StringBuilder 的 append（’hhh‘）, reverse() 方法，反转， toString()转为字符串
//字符串尽量别转为int，long，容易超过最大值，若必须转，需判断Integer/Long.MAX_VALUE

    /**
     * A constant holding the minimum value a {@code long} can
     * have, -2<sup>63</sup>.
     */
    @Native public static final long MIN_VALUE = 0x8000000000000000L;

    /**
     * A constant holding the maximum value a {@code long} can
     * have, 2<sup>63</sup>-1.
     */
    @Native public static final long MAX_VALUE = 0x7fffffffffffffffL;
    



class Solution {
    public String addBinary(String a, String b) {
        int carry = 0;
        int res  = 0;
        StringBuilder result = new StringBuilder();
        int index;
        if(a.length() >= b.length()){
            int diff = a.length()-b.length();
            for (int i = 0; i < diff; i++){
                b='0'+b;
            }
        }
        else{
             int diff = b.length() -a.length();
            for (int i = 0; i < diff; i++){
                a='0'+a;
            }
        }
        for (int i = a.length() -1 ; i >=0 ; i--){
            res = carry + (a.charAt(i)-'0' ) + (b.charAt(i) - '0');
            System.out.println(res);
            index = a.length()-i;
            if (res == 0){
                result.append('0');
                carry =0;
            }
            else if(res == 1){
                result.append('1');
                carry =0;
            }
            else if(res == 2){
                result.append('0');
                carry =1;
            }
            else if(res == 3){
                result.append('1');
                carry =1;
            }
            
        }
        if (carry == 1){
            result.append('1');
        }
        
         return result.reverse().toString();
        
    }
}