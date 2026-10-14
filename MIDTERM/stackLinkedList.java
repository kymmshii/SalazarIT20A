 
package MIDTERM;
  
public class stackLinkedList {
    private class Node {
        int data;
        Node next;
        
        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
    private Node top;
    
    public stackLinkedList() {
        top = null;
    }
    public static void main(String[] args) {
        stackLinkedList stack = new stackLinkedList();
        
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        System.out.println();
        
        stack.display();
        System.out.println("Top element: " + stack.peek());
        System.out.println("Remove: " + stack.pop());
        System.out.println("Top element: " + stack.peek());
        stack.display();
        
    }
}
