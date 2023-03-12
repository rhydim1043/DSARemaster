package com.company.DSImplementation.LinkedList;
import com.company.GenericClasses.Node;

public class LinkedList {
    // Array to LinkedList
    public static Node ArrToLL(int[] arr)
    {
        Node head = new Node();
        for(int i: arr)
           head =  insert(head,i);
        return head;
    }

    // Insert at the end of linked list
    public static Node insert(Node head, int val)
    {
        Node newNode = new Node(val);
        if (head == null)
            head = newNode;
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;
        }
        return head;
    }

    /*// Insert at any index of linked list
    public static LinkedList insert(LinkedList list, int val, int index)
    {
        Node newNode = new Node(val);

            Node temp = list.head;
            while(temp.next!=null)
            {
                temp = temp.next;
            }
            temp.next = newNode;

        return list;
    }*/

    // Returns the length of linked list
    public static int length(Node head)
    {
        Node temp = head;
        int count=0;
        while(temp.next!=null)
        {
            temp=temp.next;
            count++;
        }
        return count;
    }

    // Print the linked list
    public static void print(Node head)
    {
        if (head.next==null)
            System.out.println("Linked list is empty");
        else
        {
            Node temp = head;
            while(temp.next!=null)
            {
                temp = temp.next;
                System.out.print(temp.val +  " -> ");
            }
            System.out.println("NULL");
        }
    }

    public static void main(String[] args) {
       Node list = new Node();
       print(list);
        System.out.println(length(list));
    }
}
