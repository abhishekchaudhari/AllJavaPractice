package com.streams;

import java.util.*;
import java.util.stream.Collectors;

public class NewStreamPracticeClass {
    public static void main(String[] args) {
        Student student = new Student("a",1,"math",45.56);
        Student student2 = new Student("ab",2,"sci",41.56);
        Student student3 = new Student("abc",3,"hist",53.56);
        Student student4 = new Student("abcd",4,"bio",69.56);
        List<Student> studentList = new ArrayList<>();
        studentList.add(student);
        studentList.add(student2);
        studentList.add(student3);
        studentList.add(student4);

        Map<Boolean, List<Student>> collect = studentList.stream().collect(Collectors.partitioningBy(x -> x.getPercentage() > 60));
        System.out.println(collect);
        List<Student> collect1 = studentList.stream().sorted(Comparator.comparingDouble(Student::getPercentage).reversed()).limit(2).collect(Collectors.toList());
        System.out.println(collect1);
        Map<String, Double> collect2 = studentList.stream().collect(Collectors.toMap(Student::getName, Student::getPercentage));
        System.out.println(collect2);
        Set<String> collect3 = studentList.stream().map(Student::getSubject).collect(Collectors.toSet());
        System.out.println(collect3);
        DoubleSummaryStatistics collect4 = studentList.stream().collect(Collectors.summarizingDouble(Student::getPercentage));
        System.out.println(collect4.getCount());
        System.out.println(collect4.getMax());
        System.out.println(collect4.getMin());
        System.out.println(collect4.getSum());
        System.out.println(collect4.getAverage());

    }
}
class Student
{
    String name;

    int id;

    String subject;

    double percentage;

    public Student(String name, int id, String subject, double percentage)
    {
        this.name = name;
        this.id = id;
        this.subject = subject;
        this.percentage = percentage;
    }

    public String getName()
    {
        return name;
    }

    public int getId()
    {
        return id;
    }

    public String getSubject()
    {
        return subject;
    }

    public double getPercentage()
    {
        return percentage;
    }

    @Override
    public String toString()
    {
        return name+"-"+id+"-"+subject+"-"+percentage;
    }
}
