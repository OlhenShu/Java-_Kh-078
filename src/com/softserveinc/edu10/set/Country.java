package com.softserveinc.edu10.set;

import java.util.*;

class Country {
     public static void main(String[] args) {
         Set<String> countryHashSet = new LinkedHashSet<>();

         countryHashSet.add("Ukraine");
         countryHashSet.add("France");
         countryHashSet.add("USA");
         countryHashSet.add("Spain");
         countryHashSet.add("Spain");

         System.out.println(countryHashSet);
         System.out.println("Size of set: " + countryHashSet.size());

     }
}
