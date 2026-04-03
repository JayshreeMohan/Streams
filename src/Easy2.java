import java.lang.invoke.StringConcatFactory;
import java.sql.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Easy2 {

    public void findAllDistinctElementsFromList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        List<Integer> result = ls.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(result);
    }

    public void findAverageOfAllNumbersInAList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        double result2 = ls.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0.0);

        System.out.println(result2);
        //After applying map to int , we can put any functions of stream
    }

    public void sortInAscending(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);
        ls.add(55);

        List<Integer> result3 = ls.stream()
                .sorted()
                .collect(Collectors.toList());
        System.out.println(result3);
    }

    public void sortInDescending(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        List<Integer> result4 = ls.stream()
                .sorted((x, y) -> y - x)
                .collect(Collectors.toList());
        System.out.println(result4);
    }

    public void countStringStartingWithA(){
        List<String> ls = new ArrayList<>();
        ls.add("Adhf");
        ls.add("DJdfd");
        ls.add("JKjfhsd");
        ls.add("Akud");
        ls.add("Opdsfs");

        List<String> result5 = ls.stream()
                .filter(s -> s.toLowerCase().startsWith("a"))
                .collect(Collectors.toList());
        System.out.println(result5);
    }

    public void commaSeparatedJoining(){
        List<String> ls = List.of("Apple","Orange","Guava","Banana");
        String result6 = ls.stream()
                .collect(Collectors.joining(","));
        System.out.println(result6);
    }

    public void checkIfAllTheElementsArePositiveNumbers(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        boolean b = ls.stream()
                .allMatch(x -> x > 0);
        System.out.println(b);
    }

    public void checkIfAnyNumberIsDivisibleBy3(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(10);
        ls.add(9);
        ls.add(1);
        ls.add(4);

        boolean b1 = ls.stream()
                .anyMatch(x -> x > 3);
        System.out.println(b1);
    }

    public void flattenTheListOfList(){

        List<List<Integer>> ls = new ArrayList<>();

        List<Integer> ls1 = new ArrayList<>();
        ls1.add(100);
        ls1.add(20);

        List<Integer> ls2 = new ArrayList<>();
        ls2.add(8);
        ls2.add(11);

        ls.add(ls1);
        ls.add(ls2);

        List<Integer> list = ls.stream()
                .flatMap(List::stream)
                .toList();
        System.out.println(list);
    }

    public void findFirstNonEmptyStringInAList(){
        List<String> ls = new ArrayList<>();
        ls.add("hi");
        ls.add("hello");
        ls.add("namaskar");

        String result = ls.stream()
                .filter(s -> s != null && !s.isEmpty())
                .findFirst()
                .orElse("Default");

        System.out.println(result);
    }

    public void findTheSecondHighestNumberInAList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(100);
        ls.add(50);
        ls.add(25);

        Optional<Integer> first = ls.stream()
                .sorted((a, b) -> b - a)
                .skip(1)
                .findFirst();
        System.out.println(first.get());

    }


}
