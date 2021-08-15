package com.company;

public class Main {

    public static void main(String[] args) {
//        LinkedList ll = new LinkedList();
//        ll.createLL(9);
//        ll.insertNode(5);
//        ll.insertNode(10);
//        ll.insertNode(2);
//        ll.insertNode(1);
//        ll.traverseLL();
//        Questions q = new Questions();
//        LinkedList t = q.partition(ll,4);
//        t.traverseLL();
//        Node n = q.nthToLast(ll, 2);
//        System.out.println(n.value);
//        q.deleteDups(ll);
//        ll.traverseLL();

        LinkedList llA = new LinkedList();
        llA.insertNode(7);
        llA.insertNode(1);
        llA.insertNode(6);
        LinkedList llB = new LinkedList();
        llB.insertNode(5);
        llB.insertNode(9);
        llB.insertNode(2);
        Questions q = new Questions();
//        LinkedList result = q.sumLists(llA,llB);
//        result.traverseLL();
        q.addSameNode(llA,llB,7);
        q.addSameNode(llA,llB,2);
        q.addSameNode(llA,llB,1);
        Node inter = q.findIntersection(llA,llB);
        System.out.println(inter.value);


    }
}
