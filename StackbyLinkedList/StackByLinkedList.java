/* implementation of linked by using */
package p1;

public class StackByLinkedList {
    Node top;
    public StackByLinkedList() {
        top =null;
    }
    public void push(int value) {
        Node newnode = new Node(value);
        newnode.next=top;
        top=newnode;
    }

    public void pop(){
        if(!isEmpty()) {
            System.out.println("the Pop Output of the stack is "+top.data);
            top = top.next;
        }
    }
    public void peek(){
        if(isEmpty()) {
            System.out.println("no element");
        }
        else {
            System.out.println("the Peek Output of the stack is "+top.data);
        }
    }
    public boolean isEmpty(){
        return (top ==null);
    }
    public void display(){
        Node temp=top;
        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next;
        }
    }
        public static void main(String[] args) {
            StackByLinkedList obj = new StackByLinkedList();
            obj.push(10);
            obj.push(20);
            obj.push(40);
            obj.display();
            obj.peek();
            obj.pop();
        }
}
