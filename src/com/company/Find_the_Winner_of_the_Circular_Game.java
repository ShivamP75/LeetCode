//package com.company;
//
//import java.util.ArrayList;
//import java.util.LinkedList;
//
//public class Find_the_Winner_of_the_Circular_Game {
//    public static class Node{
//        static int data;
//        static Node next;
//
//
//        Node(int data){
//            this.data = data;
//        }
//    }
//    static Node head;
//    static int size;
//    public static void add(int data){
//        Node newNode = new Node(data);
//        if(head == null){
//            head = newNode;
//            size++;
//            return;
//        }
//        Node a = head;
//        while(a.next != null){
//            a = a.next;
//        }
//        a.next = newNode;
//        size++;
//    }
//    public static int remove(){
//        if(head == null) return 0;
//        Node a = head;
//        Node p = null;
//        while(a.next != null){
//            p = a;
//            a = a.next;
//        }
//        int res = p.next.data;
//        p.next = null;
//        return res;
//    }
//    public static void display(){
//        if(head == null){
//            System.out.println("List is Empty");
//        }
//        else{
//            Node a = head;
//            while(a != null){
//                System.out.println(a.data);
//                a = a.next;
//            }
//        }
//    }
//    public static void circular(){
//        Node a = head;
//        while(a.next != null){
//            a = a.next;
//        }
//        a.next = head;
//    }
//    public static void main(String[] args) {
//        int n = 5;
//        int k = 2;
//        System.out.println(findTheWinner(n , k));
//        ArrayList<Integer> arr = new ArrayList<>();
//        arr.add(1);
//        arr.add(2);
//
//     }
//    public static int findTheWinner(int n, int k) {
//        Find_the_Winner_of_the_Circular_Game ll = new Find_the_Winner_of_the_Circular_Game();
//
//        for (int i = 1; i <= n; i++) {
//            ll.add(i);
//        }
//        ll.circular();
//        while(ll.size != 1){
//
//        }
//    }
//
//}
