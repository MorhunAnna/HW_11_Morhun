package org.example;
import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {


        public static Map<String, Integer> strlengths(List<String> strings)
        {
            Map<String, Integer> result = new TreeMap<>(Comparator.reverseOrder());
            for (String string : strings)
            {
                result.put(string, string.length());
            }
            return result;
        }

    public static Map<Integer, List<String>> length(List<String> strings) {
        Map<Integer, List<String>> resultMap = new HashMap<>();
        for (String str : strings) {
            int length = str.length();
            resultMap.computeIfAbsent(length, k -> new ArrayList<>()).add(str);
        }
        return resultMap;
    }

        public static void main(String[] args)
        {
System.out.println("Task 1");
            List<String> strings = Arrays.asList("тут", "там", "стол");
            Map<String, Integer> result = strlengths(strings);
            System.out.println(result);

            System.out.println("Task 2");
            List<String> inputStrings = List.of("тут", "там", "стол");
            Map<Integer, List<String>> result2 = length(inputStrings);
            System.out.println(result2);
        }
        }

