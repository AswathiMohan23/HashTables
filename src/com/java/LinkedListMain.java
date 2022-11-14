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
        long code=0;
        String sentence = "“Paranoids are not paranoid because they are paranoid but because they keep \n" +
                "putting themselves deliberately into paranoid avoidable situations";
        sentence=sentence.toLowerCase();
       // char words=sentence.charAt()
        LinkedList<String> list=new LinkedList<>();
        LinkedList<String> secondList=new LinkedList<>();

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
        System.out.println("frequency of words in he given sentence : "+mapWords);
        for(int i=0;i<array.length;i++) {
            code = list.get(i).hashCode();
            secondList.add(String.valueOf(code));
            System.out.println("hash code of " + secondList.get(i) + " : " + secondList.get(i).hashCode());
        }
    }

}
