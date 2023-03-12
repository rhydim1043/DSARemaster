package com.company.LinkedListQuestions;
import com.company.DSImplementation.LinkedList.LinkedList;
import com.company.GenericClasses.Node;

public class MergeTwoSortedLists {
    public static void main(String[] args) {
        int[] arr1= {1,2,4};
        int[] arr2= {1,3,4};
        Node list1 = new Node();
        list1 = LinkedList.ArrToLL(arr1);
        Node list2 = new Node();
        list2 = LinkedList.ArrToLL(arr2);
        LinkedList.print(mergeTwoLists(list1.next,list2.next));
    }
    public static Node mergeTwoLists(Node list1, Node list2)
    {
        if(list1==null && list2==null) return null;
        if(list1==null) return list2;
        if(list2==null) return list1;
        Node head = new Node(), thead = head;
        while(list1!=null && list2!=null)
        {
            if(list1.val < list2.val)
            {
                head.next = list1;
                list1 = list1.next;
            }
            else
            {
                head.next = list2;
                list2 = list2.next;
            }
            head = head.next;
        }
        if(list1==null) head.next = list2;
        else if(list2==null) head.next = list1;
        return thead.next;
    }
}
