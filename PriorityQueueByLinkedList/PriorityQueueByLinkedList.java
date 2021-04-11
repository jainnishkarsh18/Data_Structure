package p1;

class PriorityQueueLinkedList {
    Node head;

    public void enqueue(Node newnode) {
        if (head == null || newnode.priority < head.priority) {
            newnode.next = head;
            head = newnode;
        } else {
            Node temp = head;
            while (temp.next != null && newnode.priority >= temp.next.priority) {
                temp = temp.next;
            }
            newnode.next = temp.next;
            temp.next = newnode;
        }
    }

    public void dequeue() {
        if (head == null) {
            System.out.println("Empty");
        } else {
            System.out.println("The dequeue value of the Queue is "+head.data);
            head = head.next;
        }
    }
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}
class PriorityQueueByLinkedListMain{
    public static void main(String[] args) {
        PriorityQueueLinkedList obj = new PriorityQueueLinkedList();
        Node n1 = new Node(2, 5);
        Node n2 = new Node(1, 16);
        obj.enqueue(n1);
        obj.enqueue(n2);
        obj.display();
        obj.dequeue();
        obj.display();
    }
}

