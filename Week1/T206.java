//T206.java 递归法感觉不是很好想，得假设第K步的事情

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        
        
        while(current.next!=null){
            ListNode temp = current.next;
            prev = current;
            current = current.next;
            current.next = prev;
            current = temp
            
        }
        tail = current;
        
        
        
    }
}


/*   递归法好nb


public ListNode reverseList(ListNode head) {
    if (head == null || head.next == null) return head;
    ListNode p = reverseList(head.next);
    head.next.next = head;
    head.next = null;
    return p;
}

作者：LeetCode
链接：https://leetcode-cn.com/problems/two-sum/solution/fan-zhuan-lian-biao-by-leetcode/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。

*/

