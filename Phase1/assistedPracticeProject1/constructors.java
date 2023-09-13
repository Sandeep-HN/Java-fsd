package assistedPracticeProject1;

public class constructors {

	public static void main(String[] args) {
        example person1 = new example();  
        example person2 = new example("Virat", 34); 
        person1.display();
        person2.display();
    }
}

class example {
    private String name;
    private int age;
    
    public example() {
        System.out.println("Default constructor.");
        name = "Sandeep";
        age = 22;
    }

    public example(String name, int age) {
        System.out.println("Parameterized constructor.");
        this.name = name;
        this.age = age;
    }

    public void display() {
        System.out.println("Person Name: " + name);
        System.out.println("Person Age: " + age);
    }
}
