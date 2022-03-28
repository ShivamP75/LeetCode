package com.company;

public class StackWithLL {
    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    public static class Stack{
        static Node head;

        public static boolean isEmpty(){
            if(head == null) return true;
            return false;
        }

        public static void push(int data){
            Node node = new Node(data);
            if(head == null){
                head = node;
            }
            else{
                node.next = head;
                head = node;
            }
        }
        public static int pop(){
            if(head == null){
                return -1;
            }
            else{
                int val = head.data;
                head = head.next;
                return val;
            }
        }
        public static int peek(){
            if(head == null){
                return -1;
            }
            else{

                return head.data;
            }
        }

    }


    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        System.out.println(stack.peek());
        System.out.println(stack.isEmpty());
        System.out.println(stack.pop());
        System.out.println(stack.peek());
    }

}
