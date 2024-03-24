package dev.lpa;

import java.util.ArrayList;
import java.util.List;

public class Lambda {

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

        var result = calculator((a,b)-> a+b,5,2);
        System.out.println(result);

    }

    public static <T> T calculator(Operation<T> function, T value1,T value2){
        T result = function.operate(value1,value2);
        System.out.println("Result of the operation: " + result);
        return result;
    }
}
