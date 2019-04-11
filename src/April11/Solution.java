package April11;

class Solution {

    //T13 遍历字符串， s.length() 注意字符串 indexOutOfBound
    //用case 来代替某个字符的意思
    public int romanToInt(String s) {
        int result=0;
        for(int i=0;i<s.length();i++) {
            switch (s.charAt(i)) {
                case 'I':
                    result += 1;
                    break;
                case 'V':
                    result += 5;
                    break;
                case 'X':
                    result += 10;
                    break;
                case 'L':
                    result += 50;
                    break;
                case 'C':
                    result += 100;
                    break;
                case 'D':
                    result += 500;
                    break;
                case 'M':
                    result += 1000;
                    break;
            }
            if(s.length()>=2&&i!=s.length()-1){
                if (s.charAt(i) == 'I' && s.charAt(i+1) == 'V'){
                    result-=2;
                }
                else if (s.charAt(i) == 'I' && s.charAt(i+1) == 'X'){
                    result-=2;

                }
                else if (s.charAt(i) == 'X' && s.charAt(i+1) == 'L'){
                    result-=20;

                }else if (s.charAt(i) == 'X' && s.charAt(i+1 ) == 'C'){
                    result-=20;

                }else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'D'){
                    result-=200;

                }else if (s.charAt(i) == 'C' && s.charAt(i+1) == 'M'){
                    result-=200;

                }


            }


        }
        return result;
    }

    public String longestCommonPrefix(String[] strs) {
        String result=strs[0];
        int m=0;
        for(int i=1;i<strs.length;i++){
            if(strs[i].charAt(0)!=strs[i-1].charAt(0))
                return "";
            else{
                for( m=1;m<strs[i].length();i++){
                    try{
                        if (strs[i].charAt(m)!=strs[i+1].charAt(m)){
                            return "";
                        }}
                    catch(Exception e){
                        return strs[0].substring(0,m-1);
                    }
                }

            }

        }
        return strs[0].substring(0,m);
    }

    public static void main(String[] args){
        Solution mySolution =new Solution();
        System.out.println(mySolution.romanToInt("IV"));
    }
}
