class pair {
    char c;
    int count;

    pair(char c, int count) {
        this.c = c;
        this.count = count;
    }
}
class Solution {
    public String removeDuplicates(String s, int k) {
        Stack<pair> st=new Stack<>();
        for(char ch:s.toCharArray()){
            if(!st.isEmpty() && st.peek().c==ch){
                pair p=st.peek();
                p.count++;
                if(p.count == k) st.pop();
            }
            else{
                st.push(new pair(ch,1));
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            pair p =st.pop();
            for(int i=0; i<p.count; i++){
                ans.append(p.c);
            }
        }
        return ans.reverse().toString();
    }
}