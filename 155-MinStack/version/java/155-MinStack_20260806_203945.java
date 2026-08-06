// Last updated: 06/08/2026, 20:39:45
1class MinStack {
2    Stack<Integer> stack;
3    Stack<Integer> minStack;
4
5    public MinStack() {
6        stack=new Stack<>();
7        minStack=new Stack<>();
8        
9    }
10    
11    public void push(int value) {
12        stack.push(value);
13        if(minStack.isEmpty() || value<=(minStack.peek())) {
14            minStack.push(value);
15        }
16        
17    }
18    
19    public void pop() {
20        if(stack.peek().equals(minStack.peek())) {
21            minStack.pop();
22        }
23        stack.pop();
24        
25    }
26    
27    public int top() {
28        return stack.peek();
29        
30    }
31    
32    public int getMin() {
33        return minStack.peek();
34        
35    }
36}
37
38/**
39 * Your MinStack object will be instantiated and called as such:
40 * MinStack obj = new MinStack();
41 * obj.push(value);
42 * obj.pop();
43 * int param_3 = obj.top();
44 * int param_4 = obj.getMin();
45 */