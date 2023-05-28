package org.example;

public class Person {
    private static int instanceCount = 0;
    private int localCount = 0;

    public Person() {
        instanceCount++;
        localCount++;
    }

    public static int getInstanceCount() {
        return instanceCount;
    }

    public int getLocalCount() {
        return localCount;
    }
}
