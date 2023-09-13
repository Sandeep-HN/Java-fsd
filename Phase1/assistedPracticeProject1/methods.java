package assistedPracticeProject1;

public class methods {
    static void staticMethod() {
        System.out.println("It is a static method");
    }
    void instanceMethod() {
        System.out.println("It is a instance method");
    }
    static void staticMethodWithParameters(int x, int y) {
        System.out.println("It is a static method with parameters with x = " + x + " and y = " + y);
    }
    void instanceMethodWithParameters(String str) {
        System.out.println("It is a instance method with parameters with str = " + str);
    }

    public static void main(String[] args) {
        methods.staticMethod();

        methods obj = new methods();
        obj.instanceMethod();

        methods.staticMethodWithParameters(5, 10);

        obj.instanceMethodWithParameters("Hello World!");
    }
}