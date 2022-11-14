package com.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class LinkedListMain {
    public static void main(String[] args)
    {
        findFrequency();
    }

    public static void findFrequency() {
        String sentence = "To be or not to be";
        sentence=sentence.toLowerCase();
       // char words=sentence.charAt()
        LinkedList<String> list=new LinkedList<>();
        String array[] = sentence.split(" ");
        for(int i=0;i<array.length;i++){
            list.add(array[i]);
        }
        Map<String, Integer> mapWords = new HashMap<>();
        for (String i : list) {
            if (mapWords.containsKey(i)) {
                mapWords.put(i, 1 + mapWords.get(i));
            } else {
                mapWords.put(i, 1);
            }
        }
        System.out.println(mapWords);
    }

}
