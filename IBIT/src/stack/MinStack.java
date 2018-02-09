class Minstack {
    
    //Stack contains actual data
    Stack<Integer> stack = new Stack<Integer>();
    
    //Stack contains min value
    Stack<Integer> minStack = new Stack<Integer>();
    
    public void push(int x) {

        stack.push(x);
        //Push the element if current element is less or equal to top element of min stack
        //Else push the top elemnt in the min stack
        if(minStack.isEmpty() || x <= minStack.peek())
            minStack.push(x);
        else
            minStack.push(minStack.peek());
    }

    public void pop() {
        
        if(stack.isEmpty())
            return;
        else{
            //pop the element form both stack 
            minStack.pop();
            stack.pop();
        }    
    }

    public int top() {
        if(stack.isEmpty())
            return -1;
        return stack.peek();    
    }

    public int getMin() {
        
        if(minStack.isEmpty())
            return -1;
        return minStack.peek();    
    }
}
