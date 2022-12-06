package com.streams;

import java.util.*;
import java.util.stream.Stream;


public class TerminalVsNotTerminalOperations {
    public static void main(String[] args){
        //Intermediate or Non TerminalOperations
        //filter(), map(), distinct(), sorted(), limit(), skip()

        //Terminal operations
        //forEach(), toArray(), reduce(), collect(), min(), max(), count(), anyMatch(), allMatch()
        //noneMatch(), findFirst(), findAny()

        Employee e1 = new Employee(1, "code1");
        Employee e2 = new Employee(2, "code2");
        Employee e3 = new Employee(3, "code3");
        Employee e4 = new Employee(4, "code4");

        List<Employee> employees = List.of(e1,e2,e3,e4);
//        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        intList.stream().filter(ele -> ele%2 == 0).map(ele -> ele+ele).filter(ele -> ele>5).forEach(System.out::println); //forEach(ele -> System.out.println(ele))
//        long count = intList.stream().filter(ele -> ele%2 == 0).map(ele -> ele+ele).filter(ele -> ele>5).count();
//        System.out.println(count);

        employees.stream().filter(e -> e.getId()%2 == 0).map(e -> {
            e.printName();
            return e.getId();
        }).forEach(e -> System.out.println("At last: " + e));

        Optional<Integer> maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf));
        System.out.println(maxNumber.get());
    }

}

