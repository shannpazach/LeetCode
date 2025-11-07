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
    public boolean isPalindrome(ListNode head) {
        if(head == null || head.next == null){
            return true;
        }

        ListNode copy = copyList(head);
        ListNode reverse = reverseList(copy);
        return checkSame(head, reverse);
    }

    private ListNode copyList(ListNode head){
            if(head == null){
                return null;
            }
            ListNode dummy = new ListNode(0);
            ListNode tail = dummy;
            ListNode curr = head;

            while(curr!=null){
                tail.next = new ListNode(curr.val);
                tail = tail.next;
                curr = curr.next;
            }
            return dummy.next;
        }

    private ListNode reverseList(ListNode head){
        if(head == null){
            return null;
        }

        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode newNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = newNode;
        }

        return prev;
    }

    private boolean checkSame(ListNode l1, ListNode l2){
        while(l1!=null && l2!=null){
            if(l1.val!=l2.val){
                return false;
            }
            l1 = l1.next;
            l2 = l2.next;
        }
        return true;
    }
}