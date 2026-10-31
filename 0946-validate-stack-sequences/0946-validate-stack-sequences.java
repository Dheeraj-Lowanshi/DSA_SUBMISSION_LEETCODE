class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        // Stack<Integer> stack = new Stack<>();
        // int idx=0;
        // for(int num: pushed){
        //     stack.push(num);
        //     while( !stack.isEmpty() && idx < popped.length && stack.peek() == popped[idx]){
        //         stack.pop();
        //         idx++;
        //     }
        // }
        // return idx == popped.length;
        int l=0, r=0;
        for(int num: pushed){
            pushed[l++]=num;
            while(l>0 && pushed[l-1] == popped[r]){
                r++;
                l--;
            }
        }
        return l==0;
    }
}