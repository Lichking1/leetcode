//T142.java  Using Set visited = new HashSet to save all visited nodes. although not effective,
// quiet useful for the solution.

/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode detectCycle(ListNode head) {
        if(head == null){
            return null;
        }
        
        Set<ListNode> visted = new HashSet<ListNode>();
        
        ListNode current = head;
        while(current.next != null){
            if(visted.contains(current)){
                return current;
            }
            visted.add(current);
            current = current.next;
            
        }
        
        return null;
        
        
    }
}



//solution 2 floyd algo, to be researched
/**
 * Definition for singly-linked list.
 * class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
     public ListNode detectCycle(ListNode head) {
        if(head==null){
            return null;
        }
        if(head==head.next){
            return head;
        }
        ListNode s=head; // 慢指针指向节点
        ListNode f=head; // 快指针走向节点

        s=s.next;
        f=f.next;
        if(f==null){return null;}
        f=f.next;
        if(f==null){return null;}
        while(s!=f){ // 最终两个指针在环中相遇，此时过去时间time
            s=s.next;
            f=f.next;
            if(f==null){return null;}
            f=f.next;
            if(f==null){return null;}
        }
        int circleLength=0; // 记录环的长度
        circleLength++;
        s=s.next;
        while(s!=f){
            s=s.next;
            circleLength++;
        }
        // 两个指针相同速度，但是一个指针先走环的长度。
        s=head;
        f=head;
        while(circleLength>0){
            circleLength--;
            f=f.next;
        }
        while(s!=f){ // 因为快指针先走了环的长度，所以当慢指针指向环入口，快指针已经绕环一周，并指向环入口
            s=s.next;
            f=f.next;
        }

        return s;
    }
}