package org.example;

public class Main {
    public static void main(String[] args) {
        ParentClass pc = new ParentClass();
        pc.myFunction();

        ChildClass cc =  new ChildClass();
        cc.myFunction();
        cc.myDeprecatedMethod();
    }
}