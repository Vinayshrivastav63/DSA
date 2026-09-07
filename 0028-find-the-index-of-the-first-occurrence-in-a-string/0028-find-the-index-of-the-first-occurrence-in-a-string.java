class Solution {
    public int strStr(String haystack, String needle) {
        int h = haystack.length();
        int n = needle.length();
        int i = 0;
        int j = 0;
        while(i < h && j < n){
            if(haystack.charAt(i) == needle.charAt(j)){
                i++;
                j++;
                if(j == n){
                    return i-j;
                }
            }else{
                i = i - j + 1;
                j = 0;
                
            }
        }
        return -1;
        
    }
}