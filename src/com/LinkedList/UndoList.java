package com.LinkedList;

import java.util.Stack;

public class UndoList {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.display();
        list.undo();
        list.display();
        list.undo();
        list.display();
        list.delete();
        list.display();
        list.delete();
        list.display();
        list.undo();
        list.display();
        list.undo();
        list.display();
    }
}


class LinkedList {
    static class Node {
        private int data;
        private Node next;

        public Node(int val) {
            data = val;
        }
    }

    Node head;
    Stack<Node> st;
    int count;

    public LinkedList() {
        head = null;
        st = new Stack<LinkedList.Node>();
        count = 0;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        if (head == null)
            head = newNode;
        else if (head.next == null)
            head.next = newNode;
        else {
            Node trav = head;
            while (trav.next != null)
                trav = trav.next;
            trav.next = newNode;
        }
        st.push(newNode);
        count++;
    }

    public void delete() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node trav = head;
        Node prev = null;
        while (trav.next != null) {
            prev = trav;
            trav = trav.next;
        }
        st.push(trav);
        count++;
        if (prev != null)
            prev.next = null;
        else
            head = null;
    }

    public void undo() {
        if (count == 0) {
            System.out.println("Undo limit exceeded");
            return;
        }
        Node last = st.pop();
        count--;
        if (last.next == null && st.peek().next == null) {
            Node trav = head;
            while (trav.next != null)
                trav = trav.next;
            trav.next = last;
        } else if (last.next == null && st.peek().next != null) {
            delete();
        }
        System.out.println("Done");
    }

    public void display() {
        Node trav = head;
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        System.out.print("Head ->");
        while (trav != null) {
            System.out.print(" " + trav.data);
            trav = trav.next;
        }
        System.out.println("");
    }
}

