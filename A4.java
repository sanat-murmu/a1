class Animal {
    protected void makeSound() {
        System.out.println("Animal sounds");
    }
}

class Dog extends Animal {
    protected void makeSound() {
        System.out.println("Bark");
    }

    protected void feed(String a) {
        System.out.println("Feeding the dog " + a);
    }

    protected void feed(String a, String b) {
        System.out.println("Feeding the dog " + a + " and " + b);
    }
}

class Cat extends Animal {
    protected void makeSound() {
        System.out.println("Meow");
    }
}

public class A4 {
    public static void main(String[] args) {
        // Method overriding
        Animal a = new Animal();
        a.makeSound();
        a = new Dog();
        a.makeSound();
        a = new Cat();
        a.makeSound();

        // Method overloading
        Dog d = new Dog();
        d.feed("meat");
        d.feed("vegetables", "meat");
    }
}
