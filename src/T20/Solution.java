package T20;

public class Solution {
    public boolean isValid(String s) {
        char tmp;

        if(s==null || s.equals("")){
            return true;
        }


        for(int i=0;i<s.length();){
            tmp=s.charAt(i);
            switch(tmp){
                case '(':
                    try{

                        if(s.charAt(i+1)==')'){
                            i+=2;
                        }
                        else if (s.charAt(i+1)=='['&&s.charAt(i+2)==']'&&s.charAt(i+3)==')'){
                            i+=4;
                        }
                        else if (s.charAt(i+1)=='{'&&s.charAt(i+2)=='}'&&s.charAt(i+3)==')'){
                            i+=4;
                        }
                        else{
                            return false;
                        }

                    }
                    catch(Exception e){
                        return false;
                    }
                    i+=2;
                    break;
                case '[':
                    try{
                        if (s.charAt(i+1)==']'){
                            i+=2;
                        }
                        else if (s.charAt(i+1)=='('&&s.charAt(i+2)==')'&&s.charAt(i+3)==']'){
                            i+=4;
                        }
                        else{
                            return false;
                        }}
                    catch(Exception e){
                        return false;
                    }
                    break;
                case '{':
                    try{
                        if (s.charAt(i+1)=='}'){
                            i+=2;
                        }
                        else if (s.charAt(i+1)=='('&&s.charAt(i+2)==')'&&s.charAt(i+3)=='}'){
                            i+=4;
                        }
                        else if (s.charAt(i+1)=='['&&s.charAt(i+2)==']'&&s.charAt(i+3)=='}'){
                            i+=4;
                        }
                        else if (s.charAt(i+1)=='['&&s.charAt(i+2)=='('&&s.charAt(i+3)==')'&&s.charAt(i+4)==']'&&s.charAt(i+5)=='}'){
                            i+=6;
                        }
                        else
                            return false;}
                    catch(Exception e){
                        return false;
                    }
                    break;
                default:
                    return false;
            }

        }
        return true;
    }


    public static void main(String[] args) {
        Solution mySolution =new Solution();
        String[] demo ={"aaa","aa","aaa"};
        System.out.println(mySolution.isValid("()[]{}"));

    }
}
