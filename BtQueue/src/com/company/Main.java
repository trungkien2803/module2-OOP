package com.company;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Main {


    public static void main(String[] args) {
        Queue<Integer> queue = new LinkedList<Integer>();
        queue.add(1);
        queue.add(11);
        queue.add(111);
        queue.add(1111);
        queue.add(11111);
        Iterator que = queue.iterator();

        while (que.hasNext()) {
            Object element = que.next();
            System.out.println(element);
        }


    }
}