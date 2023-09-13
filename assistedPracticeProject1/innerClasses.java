package assistedPracticeProject1;
public class innerClasses {
    private int outerValue = 10;
    public class Inner {
        public void displayInner() {
            System.out.println("Inner class method called");
            System.out.println("Outer value from inner class: " + outerValue);
        }
    }
    public static void main(String[] args) {
        innerClasses outer = new innerClasses();
        innerClasses.Inner inner = outer.new Inner();
        inner.displayInner();
        outer.outerValue = 20;
        inner.displayInner();
    }
}

