class Solution {
    public boolean backspaceCompare(String s, String t) {
        int left=s.length()-1;
        int right=t.length()-1;

        int sSkip=0;
        int tSkip=0;

        StringBuilder str1 = new StringBuilder();
        StringBuilder str2 = new StringBuilder();

        while(left >=0){
            if(s.charAt(left)=='#')
                sSkip++;
            else if(sSkip > 0){
                sSkip--;
            }
            else
                str1.append(s.charAt(left));
            left--;
        }

        while(right >=0){
            if(t.charAt(right)=='#')
                tSkip++;
            else if(tSkip > 0){
                tSkip--;
            }
            else
                str2.append(t.charAt(right));
            right--;
        }
        return str1.toString().equals(str2.toString());
    }
}