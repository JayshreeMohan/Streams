import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Easy {

    public void creatingStream(){

        //Creating Streams
        //Creating Streams through List
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(14);
        ls.add(16);
        ls.add(20);
        ls.stream().forEach(x -> System.out.println(x));

        //Creating Streams through Array
        int[]arr = new int[10];
        arr[0] = 1;
        arr[1] = 10;
        arr[2] = 8;
        arr[3] = 1;
        Arrays.stream(arr);

        //Creating Streams using Stream.of
        Stream.of(1,2,3,4,5,6);
    }

    public void filterEvenFromTheList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(5);
        ls.add(7);
        ls.add(10);

        List<Integer> result = ls.stream().filter(x -> x % 2 == 0).collect(Collectors.toList());
        System.out.println(result);
    }

    public void convertNumbersToTheirSquares(){
        List<Integer> ls = new ArrayList<>();
        ls.add(2);
        ls.add(5);
        ls.add(6);
        ls.add(10);

        List<Integer> result2 = ls.stream().map(x -> x * x).collect(Collectors.toList());
        System.out.println(result2);
    }

    public void squareEvenNumbersFromTheList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(5);
        ls.add(10);
        ls.add(12);

        List<Integer> result3 = ls.stream()
                .filter(x -> x % 2 == 0)
                .map(x -> x * x)
                .collect(Collectors.toList());

        System.out.println(result3);
    }

    public void findFirstNumberGreaterThan10(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(100);
        ls.add(9);
        ls.add(32);

        Optional<Integer> firstElement = ls.stream()
                .filter(x -> x > 10)
                .findFirst();
        System.out.println(firstElement.get());
    }

    public void countNumbersGreaterThan5(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(2);
        ls.add(100);
        ls.add(89);

        long count = ls.stream()
                .filter(x -> x > 5)
                .count();
        System.out.println(count);
    }

    public void findSumOfAllNumbers(){
        List<Integer> ls = new ArrayList<>();
        ls.add(1);
        ls.add(11);
        ls.add(10);
        ls.add(100);

        Integer reduce1 = ls.stream()
                .reduce(0, (a, b) -> a + b);
        System.out.println(reduce1);
    }

    public void findSumOfEvenNumbersInAlist(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        Integer reduce2 = ls.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> x + y);

        System.out.println(reduce2);
    }

    public void findTheMaximumNumberInAList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        Optional<Integer> max = ls.stream()
                .sorted((x, y) -> x - y)
                .findFirst();
        System.out.println(max);
    }

    public void sumOfEvenNumbersInAlLst(){
        List<Integer> ls = new ArrayList<>();
        ls.add(10);
        ls.add(20);
        ls.add(9);
        ls.add(11);

        Integer reduce3 = ls.stream()
                .filter(x -> x % 2 == 0)
                .reduce(0, (x, y) -> x + y);
        System.out.println(reduce3);

    }

}
