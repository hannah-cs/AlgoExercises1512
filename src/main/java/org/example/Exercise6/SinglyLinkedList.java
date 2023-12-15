package org.example.Exercise6;

public class SinglyLinkedList {
    Node head;
    public SinglyLinkedList(){
        this.head = null;
    }

    public void insert(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null){
                current = current.next;
            }
            current.next = newNode;
        }
    }

    @Override
    public String toString(){
        StringBuilder result = new StringBuilder();
        Node current = head;
        while (current.next != null){
            result.append(current.data).append(" -> ");
            current = current.next;
        }
        result.append(current.data);
        return result.toString();
    }

    public void deleteNode(int x) {
        Node current = head;
        Node previous = null;
        while (current != null && current.data != x){
            previous = current;
            current = current.next;
        }
        if (current == null){
            System.out.println("Node not found");
        }
        previous.next = current.next;
    }
}