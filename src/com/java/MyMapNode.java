package com.java;

public class MyMapNode {
    MyMapNode next;
    public int data;
    private  int key;
    private String value;
    public MyMapNode() {}


    public MyMapNode(MyMapNode next, int data) {
        this.next = next;
        this.data = data;
    }



    public MyMapNode getNext() {
        return next;
    }

    public void setNext(MyMapNode next) {
        this.next = next;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }


}
