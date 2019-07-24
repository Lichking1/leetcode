//T19.java:  双指针可以一次遍历

/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int count=0;
        ListNode current = head;
        
        if(current.next == null){
            head = null;
            return head;
        }
        
        
        if(n == 1){
            while(current.next.next !=null){
            current = current.next;
            count++;
            }
            current.next=null;
            
            return head;
            
        }
        
        
        while(current.next !=null){
            current = current.next;
            count++;
        }
        // count should be the total length, eg is 5.
        // result shold be count - n +1;
        
        int index = count- n;
        if(index == -1){
            head = head.next;
            return head;
        }
        else{
            count =0;
            current = head;
            while(current.next !=null){
                System.out.println(count);
                System.out.println(index);
                if (count == index && current.next.next!=null){
                    System.out.println(current.next.val);
                    current.next = current.next.next;
                    break;
                
            }
                current = current.next;
                count++;
            
                
        }    
        }
        
        
        
        return head;
        
        
        
        
        
    }
}

//一次遍历法，用到了快指针和慢指针

public ListNode removeNthFromEnd(ListNode head, int n) {
    ListNode dummy = new ListNode(0);
    dummy.next = head;
    ListNode first = dummy;
    ListNode second = dummy;
    // Advances first pointer so that the gap between first and second is n nodes apart
    for (int i = 1; i <= n + 1; i++) {
        first = first.next;
    }
    // Move first to the end, maintaining the gap
    while (first != null) {
        first = first.next;
        second = second.next;
    }
    second.next = second.next.next;
    return dummy.next;
}

作者：LeetCode
链接：https://leetcode-cn.com/problems/two-sum/solution/shan-chu-lian-biao-de-dao-shu-di-nge-jie-dian-by-l/
来源：力扣（LeetCode）
著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。