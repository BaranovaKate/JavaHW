package Homework13;

class MyOperations {
    public static <T> T executeOperation(T value, MyFunctionalInterface<T> operation) {
        return operation.performOperation(value);
    }
}