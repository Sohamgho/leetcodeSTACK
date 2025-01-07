/*
link ----> https://leetcode.com/problems/string-matching-in-an-array/?envType=daily-question&envId=2025-01-07
*/
class Solution {
    boolean subString(String w,String w2){
        int n = w.length();
        int m = w2.length();
        if(n>m){
            return false;
        }
        for(int i=0;i<m-n+1;i++){
            int j=0;
            int temp=i;
            if(w.charAt(j)==w2.charAt(temp)){
                while(j<n){
                    if(w.charAt(j)!=w2.charAt(temp)){
                        break;
                    }
                    j++;
                    temp++;
                }
                if(j==n){
                    return true;
                }
            }
        }
        return false;
    }
    public List<String> stringMatching(String[] words) {
        List<String> str = new ArrayList<>();
        for(int i=0;i<words.length;i++){
            for(int j=0;j<words.length;j++){
                if(i!=j){
                    if(subString(words[i],words[j])){
                        str.add(words[i]);
                        break;
                    }
                }
            }
        }
        return str;
    }
}
