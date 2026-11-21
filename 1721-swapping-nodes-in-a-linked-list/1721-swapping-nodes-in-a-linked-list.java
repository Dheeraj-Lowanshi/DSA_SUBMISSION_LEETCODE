/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode swapNodes(ListNode head, int k) {
        ArrayList<Integer> arr = new ArrayList<>();
        ListNode temp=head;
        while(temp!=null){
            arr.add(temp.val);
            temp=temp.next;
        }
        int n = arr.size();
        int first = arr.get(k - 1);
        int second = arr.get(n - k);

        arr.set(k - 1, second);
        arr.set(n - k, first);
        
        temp=head;
        int idx=0;
        while(temp!=null){
            temp.val=arr.get(idx++);
            temp=temp.next;
        }
        return head;
    }
}