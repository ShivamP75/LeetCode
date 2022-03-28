package com.company;



public class RotateLinkedList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {

    }
    public static int size(ListNode head){
        int size = 0;
        ListNode i = head;
        while(i != null){
            i = i.next;
            size++;
        }
        return size;
    }

    public static ListNode rotateRight(ListNode head, int k) {
        int n = size((head));
        k = k% n;
        ListNode node = divideList(head, k, n);
        ListNode reverseNode = reverseList(node);
        ListNode i = reverseNode;
        while(i.next != null) {
            i = i.next;

        }
        i.next = head;
        return reverseNode;
    }

    private static ListNode reverseList(ListNode node) {
        ListNode curr = node;
        ListNode pre = null;
        while(curr != null){
            ListNode n = curr;
            curr.next = pre;
            pre.next = curr;
            curr = n;
        }
        return pre;
    }

    private static ListNode divideList(ListNode head, int k, int n) {
        ListNode i = head;
        int j = 1;
        while(j < n - k){
            i = i.next;
            j++;
        }
        ListNode head1 = i.next;
        i.next = null;
        return head1;
    }

}
