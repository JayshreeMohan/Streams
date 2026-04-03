import beans.Employee;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Intermediate {

    public void sortListOfEmployeesBySalary(){
        Employee ram = new Employee("ram",100,22);
        Employee shyam = new Employee("shyam",500,23);
        Employee manish = new Employee("manish",800,24);

        List<Employee> list = new ArrayList<>();
        list.add(ram);
        list.add(shyam);
        list.add(manish);

        Stream<Employee> sorted = list.stream()
                .sorted(Comparator.comparingInt(Employee::getSalary).reversed());
        System.out.println(sorted);
    }

    public void calculateTheAverageAgeOfListOfPersonUsingStream(){
        Employee ram = new Employee("ram",100,22);
        Employee shyam = new Employee("shyam",500,23);
        Employee manish = new Employee("manish",800,24);

        List<Employee> list = new ArrayList<>();
        list.add(ram);
        list.add(shyam);
        list.add(manish);

        double result = list.stream()
                .mapToInt(Employee::getAge)
                .average()
                .orElse(0.0);
        System.out.println(result);
    }

    public void partitionNumberInEvenAndOddList(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);

        Map<Boolean, List<Integer>> collect = ls.stream()
                .collect(Collectors.partitioningBy(x -> x % 2 == 0));
        System.out.println(collect);
    }

    public void countingOccurrencesOfEachCharacterInAStream(){
        List<Integer> ls = new ArrayList<>();
        ls.add(11);
        ls.add(22);
        ls.add(33);
        ls.add(44);
        ls.add(44);

        Map<Integer, Long> result4 = ls.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(result4);
    }

    public void groupEmployeeByNameAndCalculateAveragrSalary(){
        Employee ram = new Employee("ram",100,22);
        Employee shyam = new Employee("shyam",500,23);
        Employee manish = new Employee("manish",800,24);

        List<Employee> list = new ArrayList<>();
        list.add(ram);
        list.add(shyam);
        list.add(manish);

        Map<String, Double> avgSalaryByDept = list.stream()
                .collect(Collectors.groupingBy(
                        Employee::getName,
                        Collectors.averagingDouble(Employee::getSalary)
                ));
        System.out.println(avgSalaryByDept);
    }
}
