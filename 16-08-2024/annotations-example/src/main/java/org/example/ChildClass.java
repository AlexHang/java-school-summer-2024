package org.example;

public class ChildClass extends ParentClass {

    @Override
    public void myFunction(){
        System.out.println("THis is child class");
    };

    @Deprecated
    @MyMarkerAnnotation
    @MySingleValueAnnotation(value = 100)
    @MyMultiValueAnnotation(val1 = 5, val2 = "my value")
    public void myDeprecatedMethod(){
        System.out.println("THis is deprecated");

    }
}
