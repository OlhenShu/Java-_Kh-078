package com.softserveinc.edu10.list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
//        List<String> list = new ArrayList<>();
//        list.add(0,"K");
//        list.add(1,"L");
//        list.add(2,"M");
//        list.add(3,"N");
//
//        //list.set(0,"Bb");
//       list.setAll(0, Arrays.asList("B"));
//        System.out.println(list);
        List<String> list = Arrays.asList("A");
        list.clear();
        System.out.println(list);
    }
}
