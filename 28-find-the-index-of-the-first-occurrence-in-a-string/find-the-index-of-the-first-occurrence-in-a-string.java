class Solution {
    public int strStr(String haystack, String needle) {
        int n = needle.length();
       

        for(int i = 0;i<=haystack.length()-n;i++){
            if(haystack.charAt(i)== needle.charAt(0)){
                if(haystack.substring(i,i+n).equals(needle)  && n<=haystack.length()){
                    return i;
                }
            }
        }
        return -1;
    }
}