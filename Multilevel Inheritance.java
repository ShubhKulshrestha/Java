// Multilevel Inheritance
class Animal {
    void eat() {
        System.out.println("This animals are eating");
    }
}
class Dog extends Animal {
    void bark() {
        System.out.println("The dog is barking.");
    }
}
class Cat extends Dog {
    void cry() {
        System.out.println("The cat is crying");
    }
}
public class Test {
    public static void main(String[] args) {
        Cat mycat = new Cat();
        mycat.cry();
        mycat.bark();
        mycat.eat();
    }
}

