package com.streams;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
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

        //Function use on object
        Function<Employee,String> employeeName = y -> y.getName();
        System.out.println("employeeName by Function: " + employeeName.apply(e1));;
        Employee e10 = new Employee(1, "code1");
//Equals() and HashCode()
        System.out.println(e1 == e10);  //false
        System.out.println(e1.equals(e10));// implemented equals method in employee class to get true
        System.out.println(e1.hashCode());

        List<Employee> employees = List.of(e1,e2,e3,e4);
//        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Integer> intList = new ArrayList<>(Arrays.asList(1,2,3,4,5));

//        intList.stream().filter(ele -> ele%2 == 0).map(ele -> ele+ele).filter(ele -> ele>5).forEach(System.out::println); //forEach(ele -> System.out.println(ele))
//        long count = intList.stream().filter(ele -> ele%2 == 0).map(ele -> ele+ele).filter(ele -> ele>5).count();
//        System.out.println(count);

        employees.stream().filter(e -> e.getId()%2 == 0).map(e -> {
            e.printName();
            return e.getId();
        }).collect(Collectors.toList()); //.forEach(e -> System.out.println("At last: " + e));

        Optional<Integer> maxNumber = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9).max(Comparator.comparing(Integer::valueOf));
        System.out.println(maxNumber.get());

        Integer max = Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 5).max((x,y) -> x-y).get();
        System.out.println("using simple code for comparator" + max);
    }

}

