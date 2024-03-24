package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<String> list = new ArrayList<>(List.of("alpha","bravo","charlie","delta"));

//        for (String s : list) {
//
//            System.out.println(s);
//
//        }

        String prefix = "nato";

        list.forEach(s-> {
            char first = s.charAt(0);
            System.out.println(prefix + " " + s + " means "+ first);
        });

    }
}
