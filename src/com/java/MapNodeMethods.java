package com.java;

public class MapNodeMethods {
    MyMapNode head;
    public void add(int data) {
        MyMapNode node = new MyMapNode();
        node.data = data;
        node.next = head;
        head = node;
    }

}
