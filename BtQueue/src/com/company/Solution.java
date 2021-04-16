package com.company;

public class Solution {

    public void enQueue(Queue q, int value) {
        Node temp = new Node();
        temp.data = value;
        if (q.front == null) {
            q.front = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }

    public int deQueue(Queue q) {
        if (q.front == null) {
            System.out.printf("Queue is empty");
            return Integer.MIN_VALUE;
        }
        int value;
        if (q.front == q.rear) {
            value = q.front.data;
            q.front = null;
            q.rear = null;
        } else {
            Node temp = q.front;
            value = temp.data;
            q.front = q.front.link;
            q.rear.link = q.front;
        }

        return value;
    }

    public void displayQueue(Queue q) {
        Node temp = q.front;
        System.out.printf("Elements in Circular Queue are:");
        while (temp.link != q.front) {
            System.out.printf("%d ", temp.data);
            temp = temp.link;
        }
        System.out.printf("%d", temp.data);
    }

    public static void main(String args[]) {
        Queue  q = new Queue();
        q.front = q.rear =  null;
        Solution solution = new Solution();
        solution.enQueue(q, 14);
        solution.enQueue(q, 22);
        solution.enQueue(q, 6);

        solution.displayQueue(q);

        System.out.printf("Deleted value = %d", solution.deQueue(q));
        System.out.printf("Deleted value = %d", solution.deQueue(q));

        solution.displayQueue(q);

        solution.enQueue(q, 9);
        solution.enQueue(q, 20);

        solution.displayQueue(q);
    }
}



