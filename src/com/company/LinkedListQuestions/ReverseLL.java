package com.company.LinkedListQuestions;
import com.company.DSImplementation.LinkedList.LinkedList;
import com.company.GenericClasses.Node;

public class ReverseLL {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,-1};
        Node head = LinkedList.ArrToLL(arr);
        LinkedList.print(revList(head.next));
    }
    public static Node revList(Node head)
    {
        if(head.next==null) return head;
        Node curr=head, prev=head, next=head.next;
        while(next!=null)
        {
            curr=next;
            next=next.next ;
            curr.next = prev;
            prev=curr;
        }
        head.next=null;
        head=curr;
        return head;
    }

}
