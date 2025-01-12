/*
link --> https://leetcode.com/problems/check-if-a-parentheses-string-can-be-valid/?envType=daily-question&envId=2025-01-12
*/

class Solution {
    public boolean canBeValid(String s, String locked) {
            if(s.length()%2==1){
        return false;
    }


    for(int i=0,k=0;i<s.length();i++){
        if(locked.charAt(i)=='1' && s.charAt(i)==')'){
            if(k==0){
                return false;
            }
            k--;
        }else{
            k++;
        }
    }

    for(int i=s.length()-1,k=0;i>=0;i--){
        if(locked.charAt(i)=='1' && s.charAt(i)=='('){
            if(k==0){
                return false;
            }
            k--;
        }else{
            k++;
        }
    }
    

    return true;
    }
}
