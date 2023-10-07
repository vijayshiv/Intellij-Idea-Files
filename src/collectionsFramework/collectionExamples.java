package collectionsFramework;

import java.util.*;

public class collectionExamples {
    static void ListExample(){
        LinkedList<Integer> l = new LinkedList<>();
        l.add(3);
        l.add(4);
        l.add(8);
        l.add(1);
        l.add(2);

        System.out.println(l);
    }
    static void queueExample(){
        LinkedList<Integer> q = new LinkedList<>();
        System.out.println(q.poll());
        q.offer(1);
        q.add(3);
        q.offer(8);
        System.out.println(q.peek());
        System.out.println(q);
    }

    static void priorityqueueExample(){
        PriorityQueue<Integer> p = new PriorityQueue<>(Comparator.reverseOrder());

        p.add(2);
        p.add(4);
        p.add(-1);
        p.offer(9);
        p.offer(0);
        System.out.println(p);
    }

    static void dequeueExample(){
        Deque<Integer> d = new ArrayDeque<>();
        d.addFirst(1);
        d.add(9);
        d.addLast(-1);
        d.addFirst(10);
        System.out.println(d);
        System.out.println(d.peek());
        System.out.println(d.peekFirst());
        System.out.println(d.peekLast());

    }
    static void hashExample(){
        TreeSet<Integer> h = new TreeSet<>();
        h.add (4);
        h.add(4);
        h.add(11);
        h.add(9);
        h.add(0);
        h.add(1);
        h.add(2);
        h.add(3);
        h.add(-1);
        h.add(-5);
        h.add(-11);
        System.out.println(h);

    }
    static void hashmapExaample(){

    }

    public static void main(String[] args) {
//        ListExample();
//        queueExample();
//        priorityqueueExample();
//        dequeueExample();
        hashExample();


    }
}
