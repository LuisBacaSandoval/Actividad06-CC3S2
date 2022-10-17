package org.example;

public class Calculator2Test {
    private int nbErrors = 0;
    public void testAdd() {
        Calculator2 calculator = new Calculator2();
        double result = calculator.add(10, 50);
        if (result != 60) {
            throw new IllegalStateException("Mal resultado: " + result);
        }
    }
    public static void main(String[] args) {
        Calculator2Test test = new Calculator2Test();
        try {
            test.testAdd();
        }
        catch (Throwable e) {
            test.nbErrors++;
            e.printStackTrace();
        }
        if (test.nbErrors > 0) {
            throw new IllegalStateException("Hay " + test.nbErrors + " error(s)");
        }
    }
}

