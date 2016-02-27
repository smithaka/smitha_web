package com.main;

import java.util.ArrayList;

public class ArrayList2Array {

    public static void main(String a[]){
        ArrayList<String> arrl = new ArrayList<String>();
        arrl.add("one");
        arrl.add("two");
        System.out.println("Actual ArrayList:"+arrl);
        String[] strArr = new String[arrl.size()];
        arrl.toArray(strArr);
        System.out.println("Created Array content:");
        for(String str:strArr){
            System.out.println(str);
        }
    }
}

