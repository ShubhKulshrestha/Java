// Hierarchical Inheritance in Java...
class Animal {
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is Barking");
    }
}
class Cat extends Animal{
    void cry(){
        System.out.println("cat is crying");
    }
} 
public class Test{
    public static void main(String[] args) {
        Cat c = new Cat();
        c.cry();
        c.eat();
        Dog d = new Dog();
        d.bark();
        d.eat();
    }
} 
