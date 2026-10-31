class Solution {
    public boolean validateStackSequences(int[] pushed, int[] popped) {
        Stack<Integer> stack = new Stack<>();
        int idx=0;
        for(int num: pushed){
            stack.push(num);
            while( !stack.isEmpty() && idx < popped.length && stack.peek() == popped[idx]){
                stack.pop();
                idx++;
            }
        }
        return idx == popped.length;
    }
}