class Animal {

    void eat() {
        System.out.println("Animal is eating.");
    }

    void sleep() {
        System.out.println("Animal is sleeping.");
    }
}

class Bird extends Animal {

    @Override
    void eat() {
        System.out.println("Bird is eating.");
    }

    @Override
    void sleep() {
        System.out.println("Bird is sleeping.");
    }

    void fly() {
        System.out.println("Bird is flying.");
    }
}

public class P1 {

    public static void main(String[] args) {

        Animal a = new Animal();
        System.out.println("Animal Object:");
        a.eat();
        a.sleep();

        System.out.println();

        Bird b = new Bird();
        System.out.println("Bird Object:");
        b.eat();
        b.sleep();
        b.fly();
    }
}