// Superclass Animal
class Animal {
    protected String name;
    protected int age;

    // Constructor
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Method to be overridden
    public void makeSound() {
    }
}

// Subclass Dog
class Dog extends Animal {
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " Dog barks");
    }
}

// Subclass Cat
class Cat extends Animal {
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " Cat meows");
    }
}

// Subclass Bird
class Bird extends Animal {
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overriding makeSound method
    @Override
    public void makeSound() {
        System.out.println(name + " Bird chooks");
    }
}

// Main class
public class AnimalHierarchy {
    public static void main(String[] args) {
        Animal dog = new Dog("Brad", 10);
        Animal cat = new Cat("Kitty", 5);
        Animal bird = new Bird("Parrot", 2);

        // Method to display sounds of animals
        dog.makeSound();
        cat.makeSound();
        bird.makeSound();
    }
}

//SampleOutput
//Brad Dog barks
//Kitty Cat meows
//Parrot Bird chooks