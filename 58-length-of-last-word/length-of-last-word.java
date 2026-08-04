class Solution {
    public int lengthOfLastWord(String s) {
        int end = s.length() -1;
        int count = 0;
        while(s.charAt(end) == ' '){
            end--;
        }
        while(s.charAt(end) != ' ' && end>=0){
            count++;
            if(end==0){
                break;
            }else{
                end--;
            }
        }

        return count;

    }
}