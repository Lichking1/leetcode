//T232.java : Stack and Queue, pop(),push(x),peek() empty()
//使用两个堆，完成队列

class MyQueue {

    private Stack<Integer> s1 ;
    private Stack<Integer> s2 ;
    /** Initialize your data structure here. */
    public MyQueue() {
        
        s1 = new Stack<Integer>();
        s2 = new Stack<Integer>();
        
    }
    
    /** Push element x to the back of queue. */
    public void push(int x) {
        s1.push(x);
    }
    
    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        int retVal;
        while(s1.empty() != true){
            s2.push(s1.pop());
        }
        retVal = s2.pop();
        
        while(s2.empty() != true){
            s1.push(s2.pop());
        }
        return retVal;
    }
    
    /** Get the front element. */
    public int peek() {
        int retVal;
        while(s1.empty() != true){
            s2.push(s1.pop());
        }
        retVal = s2.peek();
        while(s2.empty() != true){
            s1.push(s2.pop());
        }
        
        return retVal;
        
    }
    
    /** Returns whether the queue is empty. */
    public boolean empty() {
        return s1.empty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */