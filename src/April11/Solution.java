package April11;

import java.util.List;

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
        if (strs == null) {
            return null;
        }

        if (strs.length == 0) {
            return "";
        }

        int min = Integer.MAX_VALUE;  // 记录最短的字符串的长度

        // 找短字符串的长度
        for (String str : strs) {

            if (str == null) {
                return null;
            }

            if (min > str.length()) {
                min = str.length();
            }
        }

        int i; // 记录最长前缀的字符数
        boolean flag;
        for (i = 0; i < min; i++) {
            flag = true;
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    flag = false;
                    break;
                }
            }

            if (!flag) {
                break;
            }
        }

//        if (i == 0) {
//            return null;
//        }

        return strs[0].substring(0, i);}


    //实在是不知道哪里出错了，做的头大，放弃了，To be finished
    public String mylongestCommonPrefix(String[] strs) {
        int m=0;
        int out=1;
        int flag=0;
        for(int i=0;i<strs.length;i++){

            if(i+1==strs.length){

                break;
            }


            if(strs[i].equals(strs[i+1])==false){
                flag=1;
                break;
            }
        }
        if(flag==0){
            try{
                flag=1;
                return strs[0];
            }
            catch(Exception e){
                return "";
            }

        }

        for(int i=1;i<strs.length;i++){
            System.out.println("现在进行的i为"+i);
            try{
                strs[i].charAt(0);
                strs[i-1].charAt(0);

            }
            catch(Exception e){
                return "";
            }


            if(strs[i].charAt(0)!=strs[i-1].charAt(0))
                return "";
            else{
                for( m=1;m<strs[i-1].length();m++){
                    System.out.println("现在正在进行的m为"+m);
                    System.out.println("现在的out是"+out);
                    try{
                        if (strs[i].charAt(m)!=strs[i-1].charAt(m)){
                            System.out.println("条件成立");
                            out=m-1;
                        }
                        else if (strs[i].charAt(m)==strs[i-1].charAt(m)){
                            System.out.println("条件成立2");
                            out=m;
                            System.out.println("现在的out是"+out);
                        }

                    }
                    catch(Exception e){
                        System.out.println(e);
                        continue;
                    }
                }

            }

        }
        try{
            System.out.println("为什么不返回aa啊");
            return strs[0].substring(0,out);
        }
        catch(Exception e){
            return "";
        }

    }

    public static void main(String[] args){
        Solution mySolution =new Solution();
        String[] demo ={"aaa","aa","aaa"};
        System.out.println(mySolution.longestCommonPrefix(demo));
    }
}
