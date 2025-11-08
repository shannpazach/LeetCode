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
    public int getDecimalValue(ListNode head) {
        ListNode curr = head;
        int length = 0;

        while(curr!=null){
            length++;
            curr = curr.next;
        }

        int result = 0;
        curr = head;
        for(int i = length-1;i>=0;i--){
            if(head == null){
                break;
            }
            result += curr.val * Math.pow(2,i);
            curr=curr.next;
        }
        return result;
    }
}