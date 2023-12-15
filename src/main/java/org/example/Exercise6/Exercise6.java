package org.example.Exercise6;

//6. Write a Java program to delete a specified node in the middle of a singly
//linked list.
//Sample Singly linked list: 10->20->30->40->50
//Delete the fourth node i.e. 40
//Result: 10->20->30->50
//Expected Output:
//Original Linked list:
//10->20->30->40->50
//After deleting the fourth
public class Exercise6 {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insert(10);
        singlyLinkedList.insert(20);
        singlyLinkedList.insert(30);
        singlyLinkedList.insert(40);
        singlyLinkedList.insert(50);
        System.out.println("Original linked list: "+singlyLinkedList.toString());
        singlyLinkedList.deleteNode(40);
        System.out.println(singlyLinkedList.toString());
    }
}
