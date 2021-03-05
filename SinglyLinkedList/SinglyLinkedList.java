package Java_practice;

public class SinglyLinkedList {
    Node head;
    public void SinglyLinkedList(){
        head=null; //default head is null
    }
    public boolean isEmpty(){
        if(head == null) return true;
        else return false;
    }
    public void insertAtBegining(int data){
        Node newnode = new Node(data);
        newnode.next=head;
        head=newnode;
    }
    public void insertAtLast(int data){
        Node newnode = new Node(data);
        if(!isEmpty())
        {
            head = newnode;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=newnode;
        }
    }
    public void deleteFromBegining(){
        if(!isEmpty()) {
            head = head.next;
        }
        else System.out.println("No elements found");
    }
    public void deleteFromLast(){
        if(!isEmpty()) {
            if(head.next==null){
                head=null;
            }
            else {
                Node temp = head;
                while (temp.next.next != null) {
                    temp = temp.next;
                }
                temp.next = null;
            }
        }
        else System.out.println("No elements found");
    }
    public void displayElements(){
        if(!isEmpty()) {
            Node temp = head;
            while (temp!= null) {
                System.out.println(temp.data);
                temp = temp.next;
            }
        }
        else System.out.println("No elements found");
    }
    public void search(int element){
        if(!isEmpty()) {
            Node temp = head;
            while (temp!= null) {
                if (temp.data == element) {
                    System.out.println(element + " Found in the linked list");
                    return;
                }
                temp=temp.next;
            }
            if(temp == null){
                System.out.println(element + " Not found in the list");
            }
        }
        else System.out.println("No elements found");
    }
    public void insertAtSpecificPosition(int postion,int data){
        Node newnode = new Node(data);
        if(!isEmpty()){
            Node temp = head;
            Node previous=head;
            if(postion >1) {
                while (postion > 1) {
                    previous = temp;
                    temp = temp.next;
                    postion--;
                }
                newnode.next = temp;
                previous.next = newnode;
            }
            else if(postion ==1 ) insertAtBegining(data);
            else System.out.println("Position must be greater than zero");
        }
        else System.out.println("Data can be only inserted at first as no elements are their in the linked list");


    }
}
class SinglyLinkedListMain{
    public static void main(String[] args) {
        SinglyLinkedList obj = new SinglyLinkedList();
        System.out.println("Insertion");
        obj.insertAtBegining(1);
        obj.insertAtBegining(2);
        obj.insertAtBegining(4);
        obj.insertAtBegining(4);
        obj.insertAtBegining(2);
        obj.insertAtBegining(1);
        obj.displayElements();
//        System.out.println("Deletion from last");
//        obj.deleteFromLast();
//        obj.displayElements();
//        System.out.println("Deletion from begining");
//        obj.deleteFromBegining();
//        obj.displayElements();
        System.out.println("Searching");
        obj.search(5);
        obj.search(4);
        System.out.println("Specific position");
        obj.insertAtSpecificPosition(1,10);
        obj.displayElements();

    }
}
