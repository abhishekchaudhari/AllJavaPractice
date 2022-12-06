package com.practise;

public class ObjectClass {
    private int length=12;

    private int areaR(int length){
        return length * length;

    }
    public int areaPublic(int length){
        return this.length * length;
    }
}
