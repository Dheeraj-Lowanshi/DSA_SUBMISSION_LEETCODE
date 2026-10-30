class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int i=0, j=0;
        while(i<s.length() && j<spaces.length){
            if(i==(spaces[j])){
                ans.append(" ");
                j++;
            }
            else{
                ans.append(s.charAt(i));
                i++;
            }
        }
        while(i<s.length()){
            ans.append(s.charAt(i));
            i++;
        }
        return ans.toString();
    }
}