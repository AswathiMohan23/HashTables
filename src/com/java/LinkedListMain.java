package com.java;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

//UC1 : Ability to find frequency of words in a sentence like “To be or not to be”
//UC2 : Ability to find frequency of words in a large paragraph phrase “Paranoids are not paranoid because they are paranoid but
        //because they keep putting themselves deliberately into paranoid avoidable situations”
//UC3 : Remove avoidable word from the phrase “Paranoids are not paranoid because they are paranoid but because they keep putting themselves
        //deliberately into paranoid avoidable situations”

public class LinkedListMain {
    static LinkedList<String> list=new LinkedList<>();
    static LinkedList<String>listHashCode=new LinkedList<>();

    public static void main(String[] args)
    {
        findFrequency();
        removingWords();
    }

    private static void removingWords() {
        LinkedList<String> newList=new LinkedList<>();
        newList=list;
        String word="avoidable";
        word=word.toLowerCase();
        newList.remove(word);
        System.out.println("\n============================================== UC3 ===========================================================" +
                "\n\nthe remaining list is : "+newList);
    }

    public static void findFrequency() {
        System.out.println("\n\n============================================== UC1 & UC2 ===================================================");
        long code=0;
        String sentence = "“Paranoids are not paranoid because they are paranoid but because they keep \n" +
                "putting themselves deliberately into paranoid avoidable situations";
        sentence=sentence.toLowerCase();
       // char words=sentence.charAt()


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
        System.out.println("\n\nfrequency of words in he given sentence : "+mapWords+"\n\n");
        for(int i=0;i<array.length;i++) {
            code = list.get(i).hashCode();
            listHashCode.add(String.valueOf(code));
            System.out.println("hash code of " + listHashCode.get(i) + " : " + listHashCode.get(i).hashCode());
        }
    }

}
