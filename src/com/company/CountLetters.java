package com.company;

import java.util.HashMap;
import java.util.Map;

public class CountLetters {
    public HashMap counter(String str){
        HashMap<Character, Integer> hmap = new HashMap<>();
        for(char ch : str.toCharArray()){
            if(hmap.containsKey(ch))
                hmap.put(ch, hmap.get(ch) + 1);
            else
                hmap.put(ch, 1);
        }

        return hmap;
    }

    public void show(HashMap<Character, Integer> hmap){
        for(Map.Entry e: hmap.entrySet())
            System.out.println(e.getKey() + " " + e.getValue());
    }

}
