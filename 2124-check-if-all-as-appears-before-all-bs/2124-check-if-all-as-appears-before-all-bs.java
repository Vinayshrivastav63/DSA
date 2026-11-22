class Solution {
    public boolean checkString(String s) {
        int n = s.length();
        
        for(int i = 0; i < n; i++){
            int j = i + 1;
            if(s.charAt(i) == 'b'){
                while(j < n){
                    if(s.charAt(j) != 'a'){
                        j++;
                    }else{
                        return false;
                    }
                }
            }
        }
        return true;
        
    }
}