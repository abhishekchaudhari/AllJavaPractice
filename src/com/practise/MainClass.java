package com.practise;
import java.util.List;
import java.util.ArrayList;
public class MainClass {
    public static void main(String[] args) {
        ObjectClass ob = new ObjectClass();
//        ob.areaR()  will not work its private
        System.out.println(ob.areaPublic(10));

    }
}
