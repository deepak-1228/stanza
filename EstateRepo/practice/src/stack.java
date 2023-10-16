public class stack {
    Node top=null;

    //Function to push an integer into the stack.
    void push(int a)
    {
        Node temp=new Node(a);
        if(top==null) {
            top=temp;
        } else {
            temp.next=top;
            top=temp;
        }
        // Add your code here
    }

    //Function to remove an item from top of the stack.
    int pop()
    {
        if(top==null)
            return -1;
        int ans = top.data;
        top=top.next;
        return ans;
        // Add your code here
    }
}
