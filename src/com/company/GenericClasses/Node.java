package com.company.GenericClasses;

public class Node {
    public Integer val;
    public Node next;
    public Node left;
    public Node right;
    public Node(int val)
    {
        this.val=val;
        this.next=null;
        this.left=null;
        this.right=null;
    }
    public Node()
    {
        this.next=null;
        this.left=null;
        this.right=null;
    }

    public static void main(String[] args) {
    }
}
