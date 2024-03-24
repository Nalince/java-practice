package dev.lpa;

import java.util.Arrays;
import java.util.Random;
import java.util.function.BinaryOperator;
import java.util.function.Supplier;

public class FunctionalInterfaceExample {

    public static void main(String[] args) {
//        calculator((a,b)-> a+b,10,10);

//        List<String> list = new ArrayList<>(List.of("echo","easy","earnest"));
//        list.replaceAll( s -> s.charAt(0)+" - " + s.toUpperCase());
//        System.out.println(list);

        String[] emptyStrings =  new String[10];
        Arrays.setAll(emptyStrings,(i) -> "" + (i+1)+". ");
        System.out.println(Arrays.toString(emptyStrings));

        String[] names = {"Ann","Bob","Carol","David","Ed","Fred"};
        String[] randomList = randomSelectedValues(15,names,()->new Random().nextInt(0, names.length));
        System.out.println(Arrays.toString(randomList));





    }

    public static <T> T calculator(BinaryOperator<T> function, T value1, T value2){
        T result = function.apply(value1,value2);
        System.out.println("Result of the operation: " + result);
        return result;
    }

    public static String[] randomSelectedValues (int count, String[] values, Supplier<Integer> s){
        String[] selectedValues = new String[count];
        for (int i = 0; i < count; i++) {
            selectedValues[i] = values[s.get()];
        }
        return selectedValues;
    }
}
